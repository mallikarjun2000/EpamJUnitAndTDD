package epam.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromString {

	RemoveAClass swap2Chars;
	
	@BeforeEach
	void setUp() {
		swap2Chars  = new RemoveAClass();
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void test0Chars() {
		//Swap2Chars swap2chars = new Swap2Chars();
		//String actual = swap2Chars.swap("AB");
		
		assertEquals("", swap2Chars.removeA(""));//actual);
	}

	@Test
	void test1Chars() {
		//Swap2Chars swap2chars = new Swap2Chars();
		//String actual = swap2Chars.swap("AB");
		
		assertEquals("", swap2Chars.removeA("A"));//actual);
	}
	
	@Test
	void test2Chars() {
		//Swap2Chars swap2chars = new Swap2Chars();
		//String actual = swap2Chars.swap("AB");
		
		assertEquals("B", swap2Chars.removeA("AB"));//actual);
	}
	
	@Test
	void test4Chars() {
		//Swap2Chars swap4Chars = new Swap2Chars();
		//String actual = swap2Chars.swap("ABCDE");
		
		assertEquals("BCDE",swap2Chars.removeA("ABCDE"));//actual);
	}
	
	@Test
	void test5Chars() {
		assertEquals("CDE",swap2Chars.removeA("AACDE"));
	}
	
	@Test
	void test6Chars() {
		assertEquals("CDE",swap2Chars.removeA("CDE"));
	}
	
	@Test
	void test7Chars() {
		assertEquals("C",swap2Chars.removeA("C"));
	}
}
