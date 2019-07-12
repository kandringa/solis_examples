// Automatically generated by Advanced Solutions Inc. APIDevTool 2018a
// ============================================================================
// 
// A custom file header for this custom project
// 
// ============================================================================
// This Header File is for the CIFMyInterface Interface.

#ifndef __CIFMYINTERFACE_HPP__
#define __CIFMYINTERFACE_HPP__

#include "CommonTypes.hpp"
#include "MathTypes.hpp"
#include "NSMyNamespace.auto.hpp"

class MCDH_CLASS_EXPORT CIFMyInterface
{
   public:
   protected:
   private:
   public:
      CIFMyInterface(void) {}
      virtual ~CIFMyInterface(void) {}

      // property pure virtual functions that must be implemented
      virtual const double           GetDataA(void) = 0; // STRUCT_ADD_Get double DataA val 
      virtual const QUATERNION       GetDataB(void) = 0; // STRUCT_ADD_Get QUATERNION DataB val 
      virtual MyNamespace::EMyEnum   GetMyEnum(void) = 0; // STRUCT_ADD_Get MyNamespace::EMyEnum MyEnum val 
      virtual MyNamespace::MyStruct* GetMyStruct(void) = 0; // STRUCT_ADD_Get MyNamespace::MyStruct* MyStruct val 

   protected:
   private:
};

#endif /* __CIFMYINTERFACE_HPP__ */
