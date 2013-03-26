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
        
        final MaskedEditText charRepresentationText = (MaskedEditText) findViewById(R.id.charRepresentation);
        findViewById(R.id.charRepButton).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(charRepresentationText.getCharRepresentation() == 'a')
					charRepresentationText.setCharRepresentation('b');
				else if(charRepresentationText.getCharRepresentation() == 'b')
					charRepresentationText.setCharRepresentation('a');
			}
		});
    }
}