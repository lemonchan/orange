package orange.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Howtoweight01Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void sample1(View view){
        Intent i = new Intent(getApplicationContext(), Sample1Activity.class);
        startActivity(i);
    }
    
    public void sample2(View view){
        Intent i = new Intent(getApplicationContext(), Sample2Activity.class);
        startActivity(i);
    }
    
}