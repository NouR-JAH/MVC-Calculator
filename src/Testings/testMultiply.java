package Testings;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Model;

public class testMultiply {
	static double delta=1e-9;
	
	@Test
	public final void testMul_Ints() {
		Model test = new Model();
		double expected= Double.parseDouble(test.mul("3" , "4"));
		double actual = 3 * 4;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMul_Doubles() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mul("3.513" ,"4.123"));
		double actual = 3.513 * 4.123;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMul_String() {
		
		Model test = new Model();
		String expected= test.mul("one" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testMul_String2() {
		
		Model test = new Model();
		String expected= test.mul("4.123", "Three");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testMul_empty1() {
		
		Model test = new Model();
		String expected= test.mul("" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testMul_empty2() {
		
		Model test = new Model();
		String expected= test.mul("4.123", "");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testMul_Differ() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mul("7" ,"4.99124587293"));
		double actual = 7 * 4.99124587293;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testMul_Minus() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mul("-7" ,"8.3"));
		double actual = -7 * 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testAdd_Minus2() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mul("7" ,"-8.3"));
		double actual = 7 * -8.3;
		assertEquals(actual , expected , delta);

	}

}
