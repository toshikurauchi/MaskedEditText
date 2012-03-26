package br.com.sapereaude.maskedEditText;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RawTextTest {
	@Test
	public void initializesWithEmptyString() throws Exception {
		RawText rawText = new RawText();
		assertEquals("", rawText.getText());
	}
}
