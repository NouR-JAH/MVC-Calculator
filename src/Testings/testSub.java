package Testings;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Model;

public class testSub {
	
	static double delta=0;
	
	@Test
	public final void testSub_Ints() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sub("3" , "4"));
		double actual = 3 - 4;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSub_Doubles() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sub("7.513" ,"4.123"));
		double actual = 7.513 - 4.123;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSub_String() {
		
		Model test = new Model();
		String expected= test.sub("seven" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testSub_String2() {
		
		Model test = new Model();
		String expected= test.sub("4.123", "seven");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testSub_empty1() {
		
		Model test = new Model();
		String expected= test.sub("" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testSub_empty2() {
		
		Model test = new Model();
		String expected= test.sub("4.123", "");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testSub_Diff_Neg() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sub("-15" ,"4.12399124587293"));
		double actual = -15 - 4.12399124587293;
		assertEquals(actual , expected , delta);

	}
	
	
	
	@Test
	public final void testSub_Diff_Neg2() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sub("7" ,"-8.3"));
		double actual = 7 - -8.3;
		assertEquals(actual , expected , delta);

	}

}
