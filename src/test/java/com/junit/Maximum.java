package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Maximum {
	MaxNumber m=new MaxNumber();
	@Test
	public void testArrays()
	{
		int[] b= {10,1,12};
		assertEquals(m.findMax(b),12);
		
	}

}
