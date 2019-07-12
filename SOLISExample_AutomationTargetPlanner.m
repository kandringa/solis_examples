%% Target Planner Automation Testing
clear all 
close all
clc

P = genpath('C:\Program Files\AGI\STK 11\Solis\Scripts');
addpath(P);

outdir = 'C:\ProgramData\AGI\STK 11 (x64)\SOLIS\TargetPlannerSequences';
mkdir(outdir);

%% Connect to SOLIS
SOLIS_Scenario = 'C:\ProgramData\AGI\STK 11 (x64)\SOLIS\ExampleScenarios\SOLISExample_Automation\SOLISExample_Automation.sc';
STK = SOL_API_Connect(SOLIS_Scenario);

STK.SatNames = StringArray2CellArray(STK.SOL_Connect.SatelliteNames());
STK.SOL_Satellite = STK.SOL_Connect.GetSatellite(STK.SatNames{1});

%Target Planner Example Code
tp = STK.SOL_Satellite.TargetPlanner; %Get Target Planner object

% Generate before mods
tp.GenerateSequence(fullfile(outdir,'TestSequence_NoMods.seqs')); %Generate a Target Plan Sequence called TestSequence.seq in the following folder

StringArray2CellArray(tp.SlewModes()) %Show Slew Modes
tp.SelectedSlewMode = tp.SlewModes(1); %Pick 'Eigen Slew' for Slew Mode
tp.SelectedDestinationMode = 'NadirTrack'; %Pick NadirTrack for Between Mode
tp.SelectedClockingOption = 'InertialFixed'; %Pick InertialFixed for Between Clocking
tp.BtwnTgtMinDwell = 998; %Minimum time before switching to "Between Dwell Mode"

tc = tp.GetTargetingConfiguration('Scan'); %Get Targeting Configuration called "Scan"
tc.SelectedSatSensorConstraints = []; %Apply constraints from Satellite to Nothing
StringArray2CellArray(tc.SatSensorConstraints()) %Check what the contraint options are
tc.SelectedSatSensorConstraints = 'AtlasPayload'; %Set constraints form AtlasPayload instead of Nothing

targets = tp.GetTargets([1,4,2,6,8,7]); %Get Targets SE1, SS1, SE2, SS3, Tgt2, Tgt1 (in that order)   dy = {'gutphx', 'tarmac'}
tc.TargetConstraintType = 'Target'; %Change Constraint Type from Line-of-Sight to Target
tc.TargetConstraintSource = targets.Item(5).TargetName; %Select Target 'Tgt1' for Target Constraint Source. All Targets will duplicate this constrain type


tc.ConfigurationName = 'Alt_Scan'; %Rename 'Scan' to 'Alt_Scan'

tp.UseSOLISTimes = false; %Change Use SOLIS Times to false
tp.StartTime = '2/5/2016 2:25:01 PM'; %Change Start Time for Target Planner

tc.TypeOptions.Distance = 30; %Change Target Configuration Scan Distance to 30km

target = tp.GetTarget('SS3'); %Get Target 'SS3'
scan = target.GetScanOptions('Custom_LLA'); % Grab Scan Options object and change its End Target Type to Custom LLA 
scan.EndPointLatitude = 45; %Change end point latitude for SS3 to 45 degrees');

tp.GenerateSequence(fullfile(outdir,'TestSequence_WithMods.seqs')); %Generate a Target Plan Sequence called TestSequence.seq in the following folder




