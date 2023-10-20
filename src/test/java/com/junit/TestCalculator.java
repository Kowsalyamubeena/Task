package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestCalculator {
	Calculator calc=new Calculator();
	@Before
	public void print()
	{
		System.out.println("Hello");
	}
	@Test
	public void testAdd()
	{
		System.out.println("ADDITION = "+calc.add(10,20));
	}
	@Test
	public void testSub()
	{
		System.out.println("SUBTRACT = "+calc.sub());
	}
	@Test
	public void testMulti()
	{
		calc.multi(10, 10);
	}
	@Test
	public void testDiv()
	{
		calc.Div();
	}
	@After
	public void printBye()
	{
		System.out.println("Bye");
	}
	
	
	
	

}
