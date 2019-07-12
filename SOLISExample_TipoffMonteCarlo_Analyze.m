function SOLISExample_TipoffMonteCarlo_Analyze(mat_file)
% SOLISExample_TipoffMonteCarlo_Analyze('SOLISExample_TipoffMonteCarlo_MCResults_100RunSet.mat');
% Plot up the metrics

P = genpath('C:\Program Files\AGI\STK 11\Solis\Scripts');
addpath(P);

%% Load Data
load(mat_file);

%% Analyze/Plot Histograms

%%% Initial Rates
figure('NumberTitle','off','Name','Initial Rates'); subplot(4,1,1);
PlotDist([OUT.ODY_InitialRate_BDYX]*180/pi, 'Initial Rate - BDY X (deg/s)');
subplot(4,1,2);
PlotDist([OUT.ODY_InitialRate_BDYY]*180/pi, 'Initial Rate - BDY Y (deg/s)');
subplot(4,1,3);
PlotDist([OUT.ODY_InitialRate_BDYZ]*180/pi, 'Initial Rate - BDY Z (deg/s)');
subplot(4,1,4);
PlotDist([OUT.ODY_InitialRate_MAG]*180/pi, 'Initial Rate - MAG (deg/s)');

%%% Initial True Anomaly
figure('NumberTitle','off','Name','Initial True Anomaly');
PlotDist([OUT.InitialTrueAnomaly]*180/pi, 'Initial True Anomaly - deg');

%%% Rates at Rate Damp Start
figure('NumberTitle','off','Name','Rates at Rate Damp Start'); subplot(4,1,1);
PlotDist([OUT.ODY_RateDampStartRate_BDYX]*180/pi, 'Rate at Rate Damp Start - BDY X (deg/s)');
subplot(4,1,2);
PlotDist([OUT.ODY_RateDampStartRate_BDYY]*180/pi, 'Rate at Rate Damp Start - BDY Y (deg/s)');
subplot(4,1,3);
PlotDist([OUT.ODY_RateDampStartRate_BDYZ]*180/pi, 'Rate at Rate Damp Start - BDY Z (deg/s)');
subplot(4,1,4);
PlotDist([OUT.ODY_RateDampStartRate_MAG]*180/pi, 'Rate at Rate Damp Start - MAG (deg/s)');

%%% Time to Rate Damp Desired Magnitude
figure('NumberTitle','off','Name','Rate Damp Magnitude Time'); subplot(2,1,1);
PlotDist([OUT.Time_RateDampDesMag], 'Time from Tipoff to Rate Mag. < 0.1 deg/s in Rate Damp - sec');
subplot(2,1,2);
PlotDist([OUT.Time_RateDampDesMagDur], 'Time in Rate Damp to Rate Mag. < 0.1 deg/s in Rate Damp - sec');

%%% Sun Acq. Times
figure('NumberTitle','off','Name','SunAcq Time'); subplot(2,1,1);
[~,~,~,~,~,~,X_SunAcqCDF,SunAcqCDF]=PlotDist([OUT.Time_SunAcq], 'Time to Begin SunAcq - sec');
subplot(2,1,2);
[~,~,~,~,~,~,X_SunConvCDF,SunConvCDF]=PlotDist([OUT.Time_SunConv], 'Time to Converged on Sun - sec');

%%% Final Momentum State
figure('NumberTitle','off','Name','Final Momentum State'); subplot(4,1,1);
PlotDist([OUT.FinalMomentumTot_BDYX]*1000, 'Final Momentum State - BDY X (mNms)');
subplot(4,1,2);
PlotDist([OUT.FinalMomentumTot_BDYY]*1000, 'Final Momentum State - BDY Y (mNms)');
subplot(4,1,3);
PlotDist([OUT.FinalMomentumTot_BDYZ]*1000, 'Final Momentum State - BDY Z (mNms)');
subplot(4,1,4);
PlotDist([OUT.FinalMomentumTot_MAG]*1000, 'Final Momentum State - MAG (mNms)');

% Final Reaction Wheel Speeds
figure('NumberTitle','off','Name','Final RW Momentum'); subplot(3,1,1);
PlotDist([OUT.RW1_FinalSpd]*8.78E-05*1000, 'Final RW1 Momentum (mNms)');
subplot(3,1,2);
PlotDist([OUT.RW2_FinalSpd]*8.78E-05*1000, 'Final RW2 Momentum (mNms)');
subplot(3,1,3);
PlotDist([OUT.RW3_FinalSpd]*8.78E-05*1000, 'Final RW3 Momentum (mNms)');

%%% Time to Acquire Attitude
figure('NumberTitle','off','Name','Attitude Acquisition');
PlotDist([OUT.Time_ADAcquire], 'Time to Acquire Attitude (sec)');

%% Cumulative Distribution Plots
figure('NumberTitle','off','Name','Milestone Times'); grid on; hold on;
plot(X_SunAcqCDF/60, SunAcqCDF, 'linewidth', 1.5,'linestyle','--');
plot(X_SunConvCDF/60, SunConvCDF, 'g', 'linewidth', 1.5);
ylabel('Probability (%)');
xlabel('Time from Tipoff (min)');
legend('SunAcq Begin', 'Sun Converged');
title('Milestone Tipoff Times');
set(gca, 'xtick', 0:15:300)

%% Parameter Correlation Plots

%%% Milestone times vs. Initial Momentum Magnitude
figure('NumberTitle','off','Name','Sun Convergence Correlation'); grid on; hold on;
subplot(3,1,1);
PlotCorrelation(abs([OUT.InitialMomentumTot_MAG])*1000, [OUT.Time_RateDamp], 1, 'sec/mNms'); axis tight;
ylabel('Rate Damp (sec)');
xlabel('Initial Momentum Magnitude (mNms)');
title('Initial Momentum Correlation to Milestone Mode Times');
subplot(3,1,2);
PlotCorrelation(abs([OUT.InitialMomentumTot_MAG])*1000, [OUT.Time_SunConv], 1, 'sec/mNms'); axis tight;
ylabel('Sun Converged (sec)');
xlabel('Initial Momentum Magnitude (mNms)');
subplot(3,1,3);
PlotCorrelation(abs([OUT.InitialMomentumTot_MAG])*1000, [OUT.Time_SimComplete], 1, 'sec/mNms'); axis tight;
ylabel('Sim Complete (sec)');
xlabel('Initial Momentum Magnitude (mNms)');









