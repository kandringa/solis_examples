% This script is intended to follow the Automation_Adv.htm help page with
% step-by-step lines within MATLAB.  It is recommended that the user place
% breakpoints and use F10 to step through the items.
clc;

% Make sure the necessary scripts are on the Matlab path
P = genpath('C:\Program Files\AGI\STK 11\Solis\Scripts');
addpath(P);

SOLIS_Scenario = 'C:\ProgramData\AGI\STK 11 (x64)\SOLIS\ExampleScenarios\SOLISExample_Automation\SOLISExample_Automation.sc';

STK = SOL_API_Connect(SOLIS_Scenario); % Establish the connection to STK

STK.SOL_Satellite = SOL_Choose_Satellite(); % Pick the satellite, or user-select which one 

STK.SatNames = StringArray2CellArray(STK.SOL_Connect.SatelliteNames()); % Get satellite names 

STK.SOL_Satellite = STK.SOL_Connect.GetSatellite(STK.SatNames{1}); % Pick the specified satellite 

StringArray2CellArray(STK.SOL_Satellite.FactoryNames) % List names of Factories 

factory = STK.SOL_Satellite.GetFactory('FSW_Ephemeris'); % Get FSW_Ephemeris Factory 

StringArray2CellArray(factory.AccessorNames) % List Accessors for FSW_Ephemeris Factory 

StringArray2CellArray(factory.MutatorNames) % List Mutators for FSW_Ephemeris Factory 

StringArray2CellArray(factory.FunctionNames) % List Functions for FSW_Ephemeris Factory 

func = factory.GetFunction('AddEphemTarget'); % Get AddEphemTarget Function 

func.GetArgument(0).Type % Show the first Argument of Function 

config = STK.SOL_Satellite.GetConfiguration() % Get the default SOLIS Configuration 

newConfig = config.Copy('Config1') % Create new Configuration: Config1 

version = newConfig.GetComponentVersion('FOB_CtrlParms_Attitude_Standard') % Get the current version of the Component (the default version) 

version1 = version.Copy('Version1') % Make copy of default version, call it Version1 

version2 = version1.Copy('Version2') % Copy Version1 to make Version2 

boolParam = version1.GetParameter('B_ResetOnModeChange'); % Get parameter 

boolParam.Value = 0; % Change B_ResetOnModeChange parameter value to 0 (false) 

vecParam = version1.GetParameter('V_LoopGain_ATC_kgm2'); % Get parameter 

vecParam.Value.Value = [1000000 1000000 1000000]; % Change V_LoopGain_ATC_kgm2 parameter value 

newConfig.SetActive(version1); % Set Version1 as the active version for Component FOB_CtrlParms_Attitude_Standard 

newConfig.Run(); % Run the simulation 

newConfig.WaitForSimulationEnd(); % Wait until it finishes 

newConfig.SetActive(version2); % Set Version2 as the active version for Component FOB_CtrlParms_Attitude_Standard 

newConfig.Run(); % Run the simulation 

newConfig.WaitForSimulationEnd(); % Wait until it finishes 

% Notice:  After running version2 the spacecraft is not controlled well.
% You can replay the animation in STK to observe.

SOL_CleanNonSolisConfigs(SOLIS_Scenario); % Clean up any left-over configurations
