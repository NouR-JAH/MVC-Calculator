package Testings;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Model;

public class testSqrt {
	static double delta=1e-9;

	@Test
	public final void testSqrt_Int() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sqrt("4"));
		double actual = Math.sqrt(4.0);
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSqrt_Double() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sqrt("23.513"));
		double actual = Math.sqrt(23.513);
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSqrt_String() {
		
		Model test = new Model();
		String expected= test.sqrt("one");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testSqrt_empty() {
		
		Model test = new Model();
		String expected= test.sqrt("");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testSqrt_Neg() {
		
		Model test = new Model();
		String expected= test.sqrt("-9");
		String actual = "No Negative sqrt";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testSqrt_Zero() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sqrt("0"));
		double actual = Math.sqrt(0);
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSqrt_MinusZero() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sqrt("-0"));
		double actual = Math.sqrt(-0);
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testSqrt_LargeNum() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.sqrt("9999999999.76543213"));
		double actual = Math.sqrt(9999999999.76543213);
		assertEquals(actual , expected , delta);

	}
	
	
	
	


}
