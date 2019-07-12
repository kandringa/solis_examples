clc;

p = genpath('C:\Program Files\AGI\STK 11\Solis\Scripts');
addpath(p);
 
cc = Constants_and_Conversions;
set(0,'DefaultLineLineWidth',2);

[filename,pathname] = uigetfile(fullfile(pwd,'*.csv'));
OUT = SOL_Read_CSV_Report(fullfile(pathname,filename));

ax = [];

Time = OUT.Time.data - OUT.Time.data(1);

figure('NumberTitle','off','Name','SC Mode/Att/Rates');
ax(end+1) = subplot(311);
PlotMode(Time,OUT.Mode_Control_ACMode.data,OUT.Mode_Control_ACMode_Enum.data);
ax(end+1) = subplot(312);
plot(Time,OUT.ODY_EOM_Summary_Q_CBI2BDY0.data,'b'  ); grid on; hold on;
plot(Time,OUT.AD_Summary_QEst_CBI2BDY0.data          ,':b' );
plot(Time,OUT.Guidance_Qcmd_CBI2BDY0.data            ,'--b'); 
plot(Time,OUT.ODY_EOM_Summary_Q_CBI2BDY1.data,'r'); grid on; hold on;
plot(Time,OUT.AD_Summary_QEst_CBI2BDY1.data          ,':r' );
plot(Time,OUT.Guidance_Qcmd_CBI2BDY1.data            ,'--r'); 
plot(Time,OUT.ODY_EOM_Summary_Q_CBI2BDY2.data,'g'); grid on; hold on;
plot(Time,OUT.AD_Summary_QEst_CBI2BDY2.data          ,':g' );
plot(Time,OUT.Guidance_Qcmd_CBI2BDY2.data            ,'--g'); 
plot(Time,OUT.ODY_EOM_Summary_Q_CBI2BDY3.data,'k'); grid on; hold on;
plot(Time,OUT.AD_Summary_QEst_CBI2BDY3.data          ,':k' );
plot(Time,OUT.Guidance_Qcmd_CBI2BDY3.data            ,'--k'); 
title('True: Solid, AttEst: Dotted, Cmd: Dashed');
ylabel('Attitude Quaternion');
ax(end+1) = subplot(313);
plot(Time,OUT.ODY_EOM_Summary_SCRate_BDYX.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.ODY_EOM_Summary_SCRate_BDYY.data * cc.R2D,'r'); grid on; hold on;
plot(Time,OUT.ODY_EOM_Summary_SCRate_BDYZ.data * cc.R2D,'g'); grid on; hold on;
legend('X','Y','Z');
plot(Time,OUT.AD_Summary_WEst_BDYX.data                * cc.R2D,':b');
plot(Time,OUT.Guidance_Wcmd_BDYX.data                  * cc.R2D,'b--');
plot(Time,OUT.AD_Summary_WEst_BDYY.data                * cc.R2D,':r');
plot(Time,OUT.Guidance_Wcmd_BDYY.data                  * cc.R2D,'r--');
plot(Time,OUT.AD_Summary_WEst_BDYZ.data                * cc.R2D,':g');
plot(Time,OUT.Guidance_Wcmd_BDYZ.data                  * cc.R2D,'g--');
title('True: Solid, AttEst: Dotted, Cmd: Dashed');
xlabel('Time (s)');
ylabel('SC Rate (deg/s)');

figure('NumberTitle','off','Name','AD Residuals');
ax(end+1) = subplot(411);
plot(Time,OUT.AD_Sens_ResidBDYXSinclair_STR.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.AD_Sens_ResidBDYXMag_FCHMC.data    * cc.R2D,'g');
ylabel('Bdy X Residual (deg)');
legend('STR','MAG');
ax(end+1) = subplot(412);
plot(Time,OUT.AD_Sens_ResidBDYYSinclair_STR.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.AD_Sens_ResidBDYYMag_FCHMC.data    * cc.R2D,'g');
ylabel('Bdy Y Residual (deg)');
ax(end+1) = subplot(413);
plot(Time,OUT.AD_Sens_ResidBDYZSinclair_STR.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.AD_Sens_ResidBDYZMag_FCHMC.data    * cc.R2D,'g');
ylabel('Bdy Z Residual (deg)');
ax(end+1) = subplot(414);
plot(Time,OUT.AD_Sens_UpdateAvailSinclair_STR_Enum.data,'b'); grid on; hold on;
plot(Time,OUT.AD_Sens_UpdateAvailMag_FCHMC_Enum.data   ,'g');
ylabel('Update Available');
xlabel('Time (s)');

figure('NumberTitle','off','Name','Ephemeris BDY');
ax(end+1) = subplot(311);
plot(Time,OUT.EphemSummary_Nadir_UBDYX.data ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_Sun_UBDYX.data   ,'r');
plot(Time,OUT.EphemSummary_Vel_UBDYX.data   ,'g');
plot(Time,OUT.EphemSummary_MagFld_UBDYX.data,'k');
ylabel('Bdy X Vectors'); ylim([-1.1 1.1]);
legend('Nadir','Sun','Vel','MagFld');
ax(end+1) = subplot(312);
plot(Time,OUT.EphemSummary_Nadir_UBDYY.data ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_Sun_UBDYY.data   ,'r');
plot(Time,OUT.EphemSummary_Vel_UBDYY.data   ,'g');
plot(Time,OUT.EphemSummary_MagFld_UBDYY.data,'k');
ylabel('Bdy Y Vectors'); ylim([-1.1 1.1]);
ax(end+1) = subplot(313);
plot(Time,OUT.EphemSummary_Nadir_UBDYZ.data ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_Sun_UBDYZ.data   ,'r');
plot(Time,OUT.EphemSummary_Vel_UBDYZ.data   ,'g');
plot(Time,OUT.EphemSummary_MagFld_UBDYZ.data,'k');
ylabel('Bdy Z Vectors'); ylim([-1.1 1.1]);
xlabel('Time (s)');

figure('NumberTitle','off','Name','Ephemeris CBI');
ax(end+1) = subplot(311);
plot(Time,OUT.EphemSummary_Pos_CBIX.data/1000 ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_Pos_CBIY.data/1000 ,'r');
plot(Time,OUT.EphemSummary_Pos_CBIZ.data/1000 ,'g');
ylabel('CBI Position (km)');
legend('X','Y','Z');
ax(end+1) = subplot(312);
plot(Time,OUT.EphemSummary_SunPos_CBIX.data/1000 ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_SunPos_CBIY.data/1000 ,'r');
plot(Time,OUT.EphemSummary_SunPos_CBIZ.data/1000 ,'g');
ylabel('CBI Sun Position (km)');
ax(end+1) = subplot(313);
plot(Time,OUT.EphemSummary_MagFld_CBIX.data ,'b'); grid on; hold on;
plot(Time,OUT.EphemSummary_MagFld_CBIY.data ,'r');
plot(Time,OUT.EphemSummary_MagFld_CBIZ.data ,'g');
ylabel('CBI Mag Fld (T)');
xlabel('Time (s)');

figure('NumberTitle','off','Name','GPS');
ax(end+1) = subplot(411);
plot(Time,OUT.All_GPS_AcceptPos_CBIX.data/1000,'--b'); grid on; hold on;
plot(Time,OUT.All_GPS_AcceptPos_CBIY.data/1000,'--r');
plot(Time,OUT.All_GPS_AcceptPos_CBIZ.data/1000,'--g');
legend('X','Y','Z');
title('Solid: Truth, Dashed: GPS Accepted');
plot(Time,OUT.ODY_Ephemeris_Pos_CBIX.data/1000,'b');
plot(Time,OUT.ODY_Ephemeris_Pos_CBIY.data/1000,'r');
plot(Time,OUT.ODY_Ephemeris_Pos_CBIZ.data/1000,'g');
ylabel('CBI Pos (km)');
ax(end+1) = subplot(412);
plot(Time,OUT.All_GPS_AcceptVel_CBIX.data/1000,'--b'); grid on; hold on;
plot(Time,OUT.All_GPS_AcceptVel_CBIY.data/1000,'--r');
plot(Time,OUT.All_GPS_AcceptVel_CBIZ.data/1000,'--g');
plot(Time,OUT.ODY_Ephemeris_Vel_CBIX.data/1000,'b');
plot(Time,OUT.ODY_Ephemeris_Vel_CBIY.data/1000,'r');
plot(Time,OUT.ODY_Ephemeris_Vel_CBIZ.data/1000,'g');
ylabel('CBI Vel (km/s)');
ax(end+1) = subplot(413);
plot(Time,OUT.All_GPS_PosErrResid_CBIX.data,'--b.'); grid on; hold on;
plot(Time,OUT.All_GPS_PosErrResid_CBIY.data,'--r.'); 
plot(Time,OUT.All_GPS_PosErrResid_CBIZ.data,'--g.'); 
ylabel('Pos Error Residual CBI (m)');
ax(end+1) = subplot(414);
plot(Time,OUT.All_GPS_VelErrResid_CBIX.data,'--b.'); grid on; hold on;
plot(Time,OUT.All_GPS_VelErrResid_CBIY.data,'--r.'); 
plot(Time,OUT.All_GPS_VelErrResid_CBIZ.data,'--g.'); 
ylabel('Vel Error Residual CBI (m/s)');
xlabel('Time (s)');


figure('NumberTitle','off','Name','Rate Bias');
ax(end+1) = subplot(411);
plot(Time,OUT.Sinclair_STR_MeasValid_Enum.data +0,'-b'); grid on; hold on;
ylabel('Meas Validity');
legend('STR1');
ax(end+1) = subplot(412);
plot(Time, OUT.AD_Summary_RateBias_BDYX.data*cc.R2D,'-b'); grid on; hold on;
plot(Time,-OUT.ODY_MPU_Z_SensorBias.data*cc.R2D,'-r'); % -Z is X
ylabel('X Rate Bias (deg/s)');
legend('Est','True');
ax(end+1) = subplot(413);
plot(Time,OUT.AD_Summary_RateBias_BDYY.data*cc.R2D,'-b'); grid on; hold on;
plot(Time,OUT.ODY_MPU_Y_SensorBias.data*cc.R2D,'-r');
ylabel('Y Rate Bias (deg/s)');
ax(end+1) = subplot(414);
plot(Time,OUT.AD_Summary_RateBias_BDYZ.data*cc.R2D,'-b'); grid on; hold on;
plot(Time,OUT.ODY_MPU_X_SensorBias.data*cc.R2D,'-r'); % X is Z
ylabel('Z Rate Bias (deg/s)');
xlabel('Time (s)');

figure('NumberTitle','off','Name','Pointing Error');
ax(end+1) = subplot(211);
plot(Time,OUT.ODY_Pointing_Error_CtrlAttErr_BDYX.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.ODY_Pointing_Error_CtrlAttErr_BDYY.data * cc.R2D,'r');
plot(Time,OUT.ODY_Pointing_Error_CtrlAttErr_BDYZ.data * cc.R2D,'g');
ylabel('Control Error (deg)');

ax(end+1) = subplot(212);
plot(Time,OUT.ODY_Pointing_Error_EstAttErr_BDYX.data * cc.R2D,'b'); grid on; hold on;
plot(Time,OUT.ODY_Pointing_Error_EstAttErr_BDYY.data * cc.R2D,'r');
plot(Time,OUT.ODY_Pointing_Error_EstAttErr_BDYZ.data * cc.R2D,'g');
ylabel('Estimation Error (deg)');
xlabel('Time (s)');


figure('NumberTitle','off','Name','ODySSy Torque');
plot(Time,OUT.ODY_EOM_Details_TotTrq_BDYX.data*1000,'b'); grid on; hold on;
plot(Time,OUT.ODY_EOM_Details_TotTrq_BDYY.data*1000,'r');
plot(Time,OUT.ODY_EOM_Details_TotTrq_BDYZ.data*1000,'g');
ax(end+1) = gca;
ylabel('SC Torque (mNm)');
xlabel('Time (s)');

figure('NumberTitle','off','Name','Momentum');
plot(Time,OUT.Vehicle_State_TotMom_BDYX.data *1000,'b'); grid on; hold on;
plot(Time,OUT.Vehicle_State_TotMom_BDYY.data *1000,'r');
plot(Time,OUT.Vehicle_State_TotMom_BDYZ.data *1000,'g');
ylabel('Body Momentum (mNms)');
xlabel('Time (s)');
ax(end+1) = gca;
legend('X','Y','Z');

linkaxes(ax,'x');

xlim([0 Time(end)]);










