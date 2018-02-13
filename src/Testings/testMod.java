package Testings;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Model;

public class testMod {
	static double delta=1e-9;

	@Test
	public final void testMod_Ints() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("3" , "4"));
		double actual = 3 % 4 ;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMod_doubles() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("3.513" ,"4.123"));
		double actual = 3.513 % 4.123;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMod_string() {
		
		Model test = new Model();
		String expected= test.mod("one" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testMod_string2() {
		
		Model test = new Model();
		String expected= test.mod("4.123", "Seven");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	
	@Test
	public final void testMod_empty1() {
		
		Model test = new Model();
		String expected= test.mod("" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testMod_empty2() {
		
		Model test = new Model();
		String expected= test.mod("4.123", "");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testMod_NumeratorInt() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("7" ,"4.99124587293"));
		double actual = 7 % 4.99124587293;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testMod_DenominatorInt() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("7.37" ,"4"));
		double actual = 7.37 % 4;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testMod_NumeratorNeg() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("-7" ,"8.3"));
		double actual = -7 % 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMod_DenominatorNeg() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("7" ,"-8.3"));
		double actual = 7 % -8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMod_ZeroNumerator() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.mod("0" ,"8.3"));
		double actual = 0 % 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testMod_ZeroDenominator() {
		
		Model test = new Model();
		String expected= test.mod("4.123" , "0");
		String actual = "No Mod by 0";
		assertEquals(actual, expected);

	}


}
