@ECHO OFF
"C:\Program Files\ASI\MAXDevTool\MAXDevTool.exe" -library CustomComponent -archive NewArchive -basedir ".\customcomponent\ " -xmldir ".\customcomponent\xml\ " -headerdir "..\..\..\..\..\program files\agi\stk 11\solis\includes\ " -supportpath "C:\Program Files\ASI\MAXDevTool\ " -generate VS2017 -includedebugbuild -copylocal  "C:\ProgramData\AGI\STK 11 (x64)\SOLIS\SOLISExample_DevToolCustomComponent\Landmapper_BC\dll\ "
pause
