package br.com.sapereAude.maskedEditText.example;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.sapereaude.maskedEditText.MaskedEditText;
import br.com.sapereaude.maskedEditText.MaskedEditTextExampleActivity;
import br.com.sapereaude.maskedEditText.R;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MaskedEditTextExampleActivityTest {
	private MaskedEditTextExampleActivity maskedEditTextExampleActivity;
	private MaskedEditText phoneEdit;
	private MaskedEditText cpfEdit;
	private MaskedEditText dateEdit;

	@Before
	public void setUp() {
		maskedEditTextExampleActivity = new MaskedEditTextExampleActivity();
		maskedEditTextExampleActivity.onCreate(null);
		phoneEdit = (MaskedEditText) maskedEditTextExampleActivity.findViewById(R.id.phoneEdit);
		cpfEdit = (MaskedEditText) maskedEditTextExampleActivity.findViewById(R.id.cpfEdit);
		dateEdit = (MaskedEditText) maskedEditTextExampleActivity.findViewById(R.id.dateEdit);
	}
	
	@Test
	public void writesPhoneTextWithMask() throws Exception {
		phoneEdit.setText("1112345678");
		assertEquals("", phoneEdit.getText());
	}
	
	@Test
	public void doesntPutAnyTextWhenHintIsProvided() throws Exception {
		// TODO
		assertEquals("", dateEdit.getText());
	}
	
	@Test
	public void putMaskTextWhenNoHintIsProvided() throws Exception {
		// TODO
	}
}
