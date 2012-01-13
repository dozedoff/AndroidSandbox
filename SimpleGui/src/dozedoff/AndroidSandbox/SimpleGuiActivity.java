package dozedoff.AndroidSandbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleGuiActivity extends Activity {
	TextView text;
	int counter = 0;
	Button button;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        text = (TextView)this.findViewById(R.id.text);
        button = (Button)this.findViewById(R.id.button);
        
        updateText();
        button.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
				counter++;
				updateText();
			}
		});
    }
    
    
    
    private void updateText(){
    	text.setText("Button pressed "+counter+" times.");
    }
}