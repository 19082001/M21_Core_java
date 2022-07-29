package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram 
{
	@Test
    void trueAssumption()
    {
		//assumeType says that if your assumption and result both are true then it will execute else not 
    	assumeTrue(5>1);
    	assertEquals(5+2,7);
    }
	@Test
	void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	@Test
	void assumptionThat ()
	{
		String str="Snehal";
		assumingThat(str.equals("Sakshi"),
		()->assertEquals(2+3,5));
	}
}
