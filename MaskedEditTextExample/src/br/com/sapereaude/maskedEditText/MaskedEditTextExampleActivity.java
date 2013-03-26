package br.com.sapereaude.maskedEditText;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MaskedEditTextExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final MaskedEditText changingText = (MaskedEditText) findViewById(R.id.changingText);
        findViewById(R.id.charRepButton).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(changingText.getCharRepresentation() == 'a')
					changingText.setCharRepresentation('b');
				else if(changingText.getCharRepresentation() == 'b')
					changingText.setCharRepresentation('a');
			}
		});
        findViewById(R.id.maskButton).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(changingText.getMask().equals("abababab")) {
					changingText.setMask("aabbaabb");
					changingText.setHint("aabbaabb");
				}
				else if(changingText.getMask().equals("aabbaabb")) {
					changingText.setMask("abababab");
					changingText.setHint("abababab");
				}
			}
		});
    }
}