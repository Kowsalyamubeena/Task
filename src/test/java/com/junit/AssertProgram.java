package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testAssertEquals()
	{
		assertEquals(10, 10);
	}
	@Test
	public void testNull()
	{
		assertNull(null,null);
	}
	@Test
	public void testTrue()
	{
		boolean a=10>3;
		assertTrue(a);
	}
	@Test
	public void testSame()
	{
		assertSame("kows","kows");
	}
	@Test
	public void testArray()
	{
		int[]c= {8,6,30};
		int[]d= {8,6,30};
		assertArrayEquals(c,d);
	}

}
