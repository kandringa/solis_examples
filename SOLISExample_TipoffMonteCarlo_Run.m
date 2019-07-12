function SOLISExample_TipoffMonteCarlo_Run(N_Runs,varargin)
% Run Example     : SOLISExample_TipoffMonteCarlo_Run(5)                                     % Run a new set of 5 runs
% Rerun Example   : SOLISExample_TipoffMonteCarlo_Run([22,41:43,86],'SOLISExample_TipoffMonteCarlo_MCResults_100RunSet.mat') % Repeat runs 22,41,42,43 and 86 of a previously-ran set

P = genpath('C:\Program Files\AGI\STK 11\Solis\Scripts');
addpath(P);

%% Map the input arguments
Inputs.N_Runs         = N_Runs;
if nargin == 2
   Inputs.PreviousRunFile = varargin{1};
else
   Inputs.PreviousRunFile = '';
end

%% User Inputs
RootDir               = fileparts(which( 'SOLISExample_TipoffMonteCarlo_Run.m'));
Inputs.Scenario       = fullfile(RootDir,'SOLISExample_TipoffMonteCarlo','SOLISExample_TipoffMonteCarlo.sc');
Inputs.MC_Spreadsheet = fullfile(RootDir,'SOLISExample_TipoffMonteCarlo_Input.xlsx');
Inputs.MC_Sheets      = {'NominalPreCalibration','Tipoff'};
Inputs.PreRun_CustomFunctionCalls  = {'SOL_CustomInputFunction_SetOrbit(IN,isDerivedIdxs,runIdx);'};
Inputs.PostRun_CustomFunctionCalls = {['OUT(runNum) = SOLISExample_TipoffMonteCarlo_Process(''','C:\ProgramData\AGI\STK 11 (x64)\SOLIS',''',''Period_1s_Data.csv'',true,runNum);']};

%% Call the main Monte Carlo Script
if isempty(Inputs.PreviousRunFile)
   SOL_Run_MonteCarlo(Inputs.Scenario,Inputs.MC_Spreadsheet,Inputs.MC_Sheets,Inputs.PreRun_CustomFunctionCalls,Inputs.PostRun_CustomFunctionCalls,Inputs.N_Runs);
else
   SOL_ReRun_MonteCarlo(Inputs.Scenario,Inputs.PreviousRunFile,Inputs.PreRun_CustomFunctionCalls,Inputs.PostRun_CustomFunctionCalls,Inputs.N_Runs); % Rerun preserved individual run data
end