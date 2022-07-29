package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram 
{
   @DisplayName("Test is Successfully implemented")
   @Test
   void function()
   {
	   System.out.println("want to display a name");
   }
   @Test
   @Disabled("Not implementes")
   void function1()
   {
	   
   }
}
