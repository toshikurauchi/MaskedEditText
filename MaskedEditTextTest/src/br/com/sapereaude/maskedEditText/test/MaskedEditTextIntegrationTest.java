package br.com.sapereaude.maskedEditText.test;

import android.test.ActivityInstrumentationTestCase2;
import br.com.sapereaude.maskedEditText.MaskedEditText;
import br.com.sapereaude.maskedEditText.TestActivity;

public class MaskedEditTextIntegrationTest extends
		ActivityInstrumentationTestCase2<TestActivity> {

	private TestActivity activity;
	private MaskedEditText maskedEdit;

	public MaskedEditTextIntegrationTest() {
		super("br.com.sapereaude.maskedEditText", TestActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		maskedEdit = (MaskedEditText) activity.findViewById(R.id.maskedEdit);
	}
	
	public void testPreConditions() {
		assertEquals("   .   .   -  ", maskedEdit.getEditableText().toString());
	}

}
