package StringTestsHW1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void charAtTest() {
		assertEquals('g', "GoogleChrome".charAt(3));
		assertEquals('G', "GoogleChrome".charAt(0));
		assertEquals('e', "GoogleChrome".charAt(11));			
	}
	
	@Test
	@Disabled
	void charAtValuesOutOfRangeTest() {
		assertEquals('x', "GoogleChrome".charAt(-3));
		assertEquals('x', "".charAt(-1));
		assertEquals('x', "GoogleChrome".charAt(14));
	}
	
	@Test
	void compareToTest() {
		assertEquals(0,"Google".compareTo("Google"));
		assertTrue("Googl".compareTo("Google")<0);
		assertTrue("Google".compareTo("Googl")>0);
		assertFalse("Googl".compareTo("Google")>0);
		assertTrue("Google".compareTo("Google")==0);
	}
	
	@Test
	void compareToIgnoreCaseTest() {
		assertEquals(0,"google".compareToIgnoreCase("Google"));
		assertTrue("Googl".compareToIgnoreCase("Google")<0);
		assertTrue("Google".compareToIgnoreCase("googl")>0);
		assertFalse("Googl".compareToIgnoreCase("Google")>0);
		assertTrue("Google".compareToIgnoreCase("google")==0);
	}
	
	@Test
	void concatTest() {
		assertEquals("GoogleChrome", "Google".concat("Chrome"));
		assertEquals("".concat("GoogleChrome"), "GoogleChrome".concat(""));	
	}
	
	@Test
	void startsWithTest() {
		assertTrue("Google".startsWith("Goo"));
		assertFalse("Google".startsWith("gle"));
		assertTrue("Google".startsWith(""));
	}
	@Test
	void endWithTest() {
		assertTrue("Google".endsWith("gle"));
		assertFalse("Google".endsWith("Goo"));
		assertTrue("Google".endsWith(""));
	}
	
	@Test
	void containsTest() {
		assertTrue("Google".contains("ogl"));
		assertFalse("Google".contains("lgo"));
		assertTrue("Google".contains("o"));
		assertTrue("Google".contains(""));
	}
	
	@Test
	void indexOfTest() {
		assertEquals(4, "GoogleChrome".indexOf("leC"));
		assertEquals(8, "GoogleChrome".lastIndexOf("rom",8 ));
		assertEquals(-1, "GoogleChrome".lastIndexOf("rom",7));
		assertEquals(-1, "GoogleChrome".indexOf("rom",15 ));
		assertEquals(6, "GoogleChrome".indexOf('C'));
		assertEquals(9, "GoogleChrome".indexOf('o',5));
	}
	
	@Test
	void lastIndexOfTest() {
		assertEquals(9, "GoogleChrome".lastIndexOf("om"));
		assertEquals(6, "GoogleChrome".lastIndexOf("Ch",9 ));
		assertEquals(8, "GoogleChrome".lastIndexOf("rom",8));
		assertEquals(-1, "GoogleChrome".lastIndexOf("rom",7));
		assertEquals(-1, "GoogleChrome".lastIndexOf('C',3));
		assertEquals(9, "GoogleChrome".lastIndexOf('o',9));	
	}
		
}
