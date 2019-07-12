function KeyResults = SOLISExample_TipoffMonteCarlo_Process( resultsDir,fileName,deleteFiles,runNum )

%% Define full Monte Carlo file name
fileName = ['Run_',num2str(runNum,'%04d'),'_',fileName];

%% Find latest directory
D = dir(resultsDir);
timetag = 0;
for dirs = 1:length(D)
    if D(dirs).isdir
        if D(dirs).datenum > timetag && (strncmp(D(dirs).name,'MC_2',4) || strncmp(D(dirs).name,'ReRun_MCResults_2',17))
            timetag = D(dirs).datenum;
            latest = dirs;
        end%if
    end%if
end%for

%% Read test data
DATA = SOL_Read_CSV_Report(fullfile(resultsDir,[D(latest).name,'\',fileName]));

% Compute elapsed time
EpochSec = DATA.Time.data - DATA.Time.data(1);

% Pull out the rate vector magnitude
ODY_RateVec                 = [DATA.ODY_EOM_Summary_SCRate_BDYX.data, DATA.ODY_EOM_Summary_SCRate_BDYY.data,DATA.ODY_EOM_Summary_SCRate_BDYZ.data];
ODY_RateMag                 = sqrt(sum(ODY_RateVec.*ODY_RateVec,2));

%% Save key results

% Initial Rates - rad/s
KeyResults.ODY_InitialRate_BDYX = DATA.ODY_EOM_Summary_SCRate_BDYX.data(1);
KeyResults.ODY_InitialRate_BDYY = DATA.ODY_EOM_Summary_SCRate_BDYY.data(1);
KeyResults.ODY_InitialRate_BDYZ = DATA.ODY_EOM_Summary_SCRate_BDYZ.data(1);
KeyResults.ODY_InitialRate_MAG  = ODY_RateMag(1);

% Initial Quaternion
KeyResults.ODY_InitialAtt_Q_CBI2BDY0 = DATA.ODY_EOM_Summary_Q_CBI2BDY0.data(1);
KeyResults.ODY_InitialAtt_Q_CBI2BDY1 = DATA.ODY_EOM_Summary_Q_CBI2BDY1.data(1);
KeyResults.ODY_InitialAtt_Q_CBI2BDY2 = DATA.ODY_EOM_Summary_Q_CBI2BDY2.data(1);
KeyResults.ODY_InitialAtt_Q_CBI2BDY3 = DATA.ODY_EOM_Summary_Q_CBI2BDY3.data(1);

% True Anomaly - rad
KeyResults.InitialTrueAnomaly = DATA.EphemSummary_TrueAnomaly.data(5);

% Rate Damp Entry Time
idx_RateDamp = find(strcmp(DATA.Mode_Control_ACMode.data,'RateDamp') == 1,1);
KeyResults.Time_RateDamp                = EpochSec(idx_RateDamp); % sec
KeyResults.ODY_RateDampStartRate_BDYX   = DATA.ODY_EOM_Summary_SCRate_BDYX.data(idx_RateDamp); % rad/s
KeyResults.ODY_RateDampStartRate_BDYY   = DATA.ODY_EOM_Summary_SCRate_BDYY.data(idx_RateDamp); % rad/s
KeyResults.ODY_RateDampStartRate_BDYZ   = DATA.ODY_EOM_Summary_SCRate_BDYZ.data(idx_RateDamp); % rad/s
KeyResults.ODY_RateDampStartRate_MAG    = ODY_RateMag(idx_RateDamp); % rad/s

% Time from rate damp entry to rate magnitude below 0.1 deg/s
idx_RateDampDesMag                  = find(ODY_RateMag(idx_RateDamp:end) < 0.1*pi/180,1)+idx_RateDamp+1;
KeyResults.Time_RateDampDesMag      = EpochSec(idx_RateDampDesMag); % sec
KeyResults.Time_RateDampDesMagDur   = EpochSec(idx_RateDampDesMag) - EpochSec(idx_RateDamp); % sec

% First time in SunAcq - sec
idx_SunAcq              = find(strcmp(DATA.Mode_Control_ACMode.data,'SunAcq') == 1,1);
KeyResults.Time_SunAcq  = EpochSec(idx_SunAcq); % sec
idx_SunConv             = find(strcmp(DATA.SunAcq_SunConverged.data, 'False') == 1,1,'last');
KeyResults.Time_SunConv = EpochSec(idx_SunConv); % sec

% First time in EigenSlew - sec
idx_EigenSlew             = find(strcmp(DATA.Mode_Control_ACMode.data,'EigenSlew') == 1,1);
KeyResults.Time_SunAcqDur = EpochSec(idx_EigenSlew) - EpochSec(idx_SunAcq); % sec
KeyResults.Time_EigenSlew = EpochSec(idx_EigenSlew); % sec

% Total time of run
KeyResults.Time_SimComplete = EpochSec(end); % sec

% First time in SunTrack - sec
idx_SunTrack                    = find(strcmp(DATA.Mode_Control_ACMode.data,'SunTrack') == 1,1);
if (isempty(idx_SunTrack))
    % Did not make it to suntrack
    KeyResults.Time_EigenSlewDur    = 0; % sec
    KeyResults.Time_SunTrack        = EpochSec(end); % sec
	
	 KeyResults.KnowledgeErrMean_SunTrack_BDYX = NaN;
    KeyResults.KnowledgeErrMean_SunTrack_BDYY = NaN;
    KeyResults.KnowledgeErrMean_SunTrack_BDYZ = NaN;
    KeyResults.KnowledgeErrMean_SunTrack_MAG  = NaN;
                                                NaN;
    KeyResults.PointingErrMean_SunTrack_BDYX  = NaN;
    KeyResults.PointingErrMean_SunTrack_BDYY  = NaN;
    KeyResults.PointingErrMean_SunTrack_BDYZ  = NaN;
    KeyResults.PointingErrMean_SunTrack_MAG   = NaN;
                                                NaN;
    KeyResults.CtrlErrMean_SunTrack_BDYX      = NaN;
    KeyResults.CtrlErrMean_SunTrack_BDYY      = NaN;
    KeyResults.CtrlErrMean_SunTrack_BDYZ      = NaN;
    KeyResults.CtrlErrMean_SunTrack_MAG       = NaN;
    
    % Save data files
    deleteFiles = false;
else
    KeyResults.Time_EigenSlewDur    = EpochSec(idx_SunTrack) - EpochSec(idx_EigenSlew); % sec
    KeyResults.Time_SunTrack        = EpochSec(idx_SunTrack); % sec
    
    
    % Pointing accuracy in SunTrack - rad
    % Average over 10 seconds starting 10 seconds into SunTrack
    idx_AvgStart = find(EpochSec >= EpochSec(idx_SunTrack)+10,1);
    idx_AvgEnd   = find(EpochSec >= EpochSec(idx_AvgStart)+10,1);
    
    KeyResults.KnowledgeErrMean_SunTrack_BDYX = mean(DATA.ODY_Pointing_Error_EstAttErr_BDYX.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.KnowledgeErrMean_SunTrack_BDYY = mean(DATA.ODY_Pointing_Error_EstAttErr_BDYY.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.KnowledgeErrMean_SunTrack_BDYZ = mean(DATA.ODY_Pointing_Error_EstAttErr_BDYZ.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.KnowledgeErrMean_SunTrack_MAG  = mean(DATA.ODY_Pointing_Error_EstAttErrMag.data(idx_AvgStart:idx_AvgEnd)); % rad
    
    KeyResults.PointingErrMean_SunTrack_BDYX  = mean(DATA.ODY_Pointing_Error_TotAttErr_BDYX.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.PointingErrMean_SunTrack_BDYY  = mean(DATA.ODY_Pointing_Error_TotAttErr_BDYY.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.PointingErrMean_SunTrack_BDYZ  = mean(DATA.ODY_Pointing_Error_TotAttErr_BDYZ.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.PointingErrMean_SunTrack_MAG   = mean(DATA.ODY_Pointing_Error_TotAttErrMag.data(idx_AvgStart:idx_AvgEnd)); % rad
    
    KeyResults.CtrlErrMean_SunTrack_BDYX      = mean(DATA.ODY_Pointing_Error_CtrlAttErr_BDYX.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.CtrlErrMean_SunTrack_BDYY      = mean(DATA.ODY_Pointing_Error_CtrlAttErr_BDYY.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.CtrlErrMean_SunTrack_BDYZ      = mean(DATA.ODY_Pointing_Error_CtrlAttErr_BDYZ.data(idx_AvgStart:idx_AvgEnd)); % rad
    KeyResults.CtrlErrMean_SunTrack_MAG       = mean(DATA.ODY_Pointing_Error_CtrlAttErrMag.data(idx_AvgStart:idx_AvgEnd)); % rad
    
end

% Momentum State - Nms
KeyResults.InitialMomentumTot_BDYX = DATA.Vehicle_State_TotMom_BDYX.data(5); % Nms
KeyResults.InitialMomentumTot_BDYY = DATA.Vehicle_State_TotMom_BDYY.data(5); % Nms
KeyResults.InitialMomentumTot_BDYZ = DATA.Vehicle_State_TotMom_BDYZ.data(5); % Nms
KeyResults.InitialMomentumTot_MAG  = DATA.Vehicle_State_TotMomMag.data(5);   % Nms

KeyResults.FinalMomentumTot_BDYX = DATA.Vehicle_State_TotMom_BDYX.data(end); % Nms
KeyResults.FinalMomentumTot_BDYY = DATA.Vehicle_State_TotMom_BDYY.data(end); % Nms
KeyResults.FinalMomentumTot_BDYZ = DATA.Vehicle_State_TotMom_BDYZ.data(end); % Nms
KeyResults.FinalMomentumTot_MAG  = DATA.Vehicle_State_TotMomMag.data(end);   % Nms

% Final Wheel Speeds - rad/s
KeyResults.RW1_FinalSpd = DATA.ODY_RW_Px_MeasSpeed.data(end); % rad/s
KeyResults.RW2_FinalSpd = DATA.ODY_RW_Py_MeasSpeed.data(end); % rad/s
KeyResults.RW3_FinalSpd = DATA.ODY_RW_Mz_MeasSpeed.data(end); % rad/s

% Time to acquire attitude
idx_ADAcquire             = find(strcmp(DATA.AD_Summary_ADState.data,'DETERMINED') == 1,1);
KeyResults.Time_ADAcquire = EpochSec(idx_ADAcquire); % sec

%% Test run directory cleanup
if deleteFiles
    delete(fullfile(resultsDir,[D(latest).name,'\',fileName]))
end%if

end

