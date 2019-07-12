// Automatically generated by Advanced Solutions Inc. MAXDevTool 2018a
// 
// ============================================================================
// 
// A custom file header for this custom project
// 
// ============================================================================
// 
// The interface functions to be an MCDH plugin .dll
// This file is automatically overwritten - changes will not be saved.

#include "CommonTypes.hpp"
#include "CustomComponent_Init.auto.hpp"

#ifdef INCLUDE_CUSTOMDISTURBANCE
#include "CustomDisturbance.hpp"
#endif /* INCLUDE_CUSTOMDISTURBANCE */

MCDH_FUNC_EXPORT void CustomComponent_Init(void)
{
   #ifdef INCLUDE_CUSTOMDISTURBANCE
   CCustomDisturbance::CreateFactory();
   #endif /* INCLUDE_CUSTOMDISTURBANCE */

}

MCDH_FUNC_EXPORT void CustomComponent_Destroy(void)
{
   #ifdef INCLUDE_CUSTOMDISTURBANCE
   CCustomDisturbance::DestroyFactory();
   #endif /* INCLUDE_CUSTOMDISTURBANCE */

}

// This code is only needed when compiling a WIN32 DLL.
// DLL_PROJECT is defined for the automatically generated Visual Studio project.
#ifdef DLL_PROJECT

#pragma comment(lib, "C:\\Program Files\\ASI\\MAXDevTool\\MCDH_Core.lib") // Assuming MCDH_Core.lib is properly placed in the Support Path directory
#pragma comment(linker, "/export:_MCDH_get_extension_version") // Allows MCDH_get_extension_version()

MCDH_FUNC_EXPORT void MCDH_extension_load(void)
{
   CustomComponent_Init();
}

MCDH_FUNC_EXPORT void MCDH_extension_unload(void)
{
   CustomComponent_Destroy();
}

#endif /* DLL_PROJECT */
