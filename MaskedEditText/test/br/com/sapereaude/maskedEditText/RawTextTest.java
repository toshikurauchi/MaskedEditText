package br.com.sapereaude.maskedEditText;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RawTextTest {
	private RawText rawText;

	@Before
	public void setUp() {
		rawText = new RawText();
	}
	
	@Test
	public void initializesWithEmptyString() throws Exception {
		assertEquals("", rawText.getText());
	}
	
	@Test
	public void addNullStringToNegativePosition() throws Exception {
		rawText.addToString(null, -1, 5);
		assertEquals("", rawText.getText());
	}
	
	@Test
	public void addNullStringToPositionLargerThanLength() throws Exception {
		rawText.addToString(null, 10, 5);
		assertEquals("", rawText.getText());
	}
	
	@Test
	public void addEmptyStringToNegativePosition() throws Exception {
		rawText.addToString("", -1, 5);
		assertEquals("", rawText.getText());
	}
	
	@Test
	public void addEmptyStringToPositionLargerThanLength() throws Exception {
		rawText.addToString("", 10, 5);
		assertEquals("", rawText.getText());
	}
	
	@Test
	public void addString() throws Exception {
		String test = "test";
		rawText.addToString(test, 0, 4);
		assertEquals(test, rawText.getText());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void addStringToNegativePosition() throws Exception {
		rawText.addToString("test", -1, 5);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void addStringToPositionLargerThanLength() throws Exception {
		rawText.addToString("test", 10, 5);
	}
	
	@Test
	public void insertStringInTheMiddle() throws Exception {
		String expected = "insert text here";
		rawText.addToString("insert here", 0, 20);
		rawText.addToString("text ", 7, 20);
		assertEquals(expected, rawText.getText());
	}
	
	@Test
	public void insertAsMuchAsItFitsIntoString() throws Exception {
		String expected = "insert text here";
		rawText.addToString("insert here", 0, expected.length());
		rawText.addToString("text larger than maximum", 7, expected.length());
		assertEquals(expected, rawText.getText());
	}
	
	@Test
	public void doesntInsertAnythingIfItDoesntFit() throws Exception {
		String maximum = "maximum";
		rawText.addToString(maximum, 0, maximum.length());
		rawText.addToString("this shouldnt be inserted", maximum.length()/2, maximum.length());
		assertEquals(maximum, rawText.getText());
	}
}
