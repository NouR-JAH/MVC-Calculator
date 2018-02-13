package Testings;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Model;

public class testDiv {
	static double delta=1e-9;

	@Test
	public final void testDiv_ints() {
		Model test = new Model();
		double expected= Double.parseDouble(test.div("3" , "4"));
		double actual = 3.0 / 4.0;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testDiv_doubles() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("3.513" ,"4.123"));
		double actual = 3.513 / 4.123;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testDiv_string() {
		
		Model test = new Model();
		String expected= test.div("one" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testDiv_string2() {
		
		Model test = new Model();
		String expected= test.div("4.123", "Seven");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testDiv_empty1() {
		
		Model test = new Model();
		String expected= test.div("" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testDiv_sempty2() {
		
		Model test = new Model();
		String expected= test.div("4.123", "");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testDiv_NumeratorInt() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("7" ,"4.99124587293"));
		double actual = 7 / 4.99124587293;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testDiv_DenominatorInt() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("7.37" ,"4"));
		double actual = 7.37 / 4;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testDiv_NumeratorNeg() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("-7" ,"8.3"));
		double actual = -7 / 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testDiv_DenominatorNeg() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("7" ,"-8.3"));
		double actual = 7 / -8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testDiv_ZeroNumerator() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.div("0" ,"8.3"));
		double actual = 0 / 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testDev_ZeroDenominator() {
		
		Model test = new Model();
		String expected= test.div("4.123" , "0");
		String actual = "Cannot divide by 0";
		assertEquals(actual, expected);

	}

}
