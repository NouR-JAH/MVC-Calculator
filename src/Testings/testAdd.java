package Testings;

import static org.junit.Assert.*;
import org.junit.Test;

import calculator.Model;


public class testAdd {
	static double delta=0;
	
	
	@Test
	public final void testAdd_Ints() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.add("3" , "4"));
		double actual = 3 + 4;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testAdd_Doubles() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.add("3.513" ,"4.123"));
		double actual = 3.513 + 4.123;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testAdd_String() {
		
		Model test = new Model();
		String expected= test.add("one" ,"4.123");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testAdd_String2() {
		
		Model test = new Model();
		String expected= test.add("4.123", "Three");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testAdd_empty2() {
		
		Model test = new Model();
		String expected= test.add("4.123", "");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	
	@Test
	public final void testAdd_empty1() {
		
		Model test = new Model();
		String expected= test.add("", "Three");
		String actual = "Error: String";
		assertEquals(actual, expected);

	}
	
	@Test
	public final void testAdd_Differ() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.add("7" ,"4.99124587293"));
		double actual = 7 + 4.99124587293;
		assertEquals(actual , expected , delta);

	}
	
	
	@Test
	public final void testAdd_Minus() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.add("-7" ,"8.3"));
		double actual = -7 + 8.3;
		assertEquals(actual , expected , delta);

	}
	
	@Test
	public final void testAdd_Minus2() {
		
		Model test = new Model();
		double expected= Double.parseDouble(test.add("7" ,"-8.3"));
		double actual = 7 + -8.3;
		assertEquals(actual , expected , delta);

	}
	

}
