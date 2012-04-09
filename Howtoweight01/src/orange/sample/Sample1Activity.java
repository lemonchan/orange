package orange.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sample1Activity extends Activity{
    
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.WHITE);
        setContentView(linearLayout);
        
        TextView tv1 = new TextView(this);
        tv1.setText("Weight 1");
        tv1.setBackgroundColor(Color.GREEN);
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(FP, WC, 1f));
        
        TextView tv2 = new TextView(this);
        tv2.setText("Weight 0");
        tv2.setBackgroundColor(Color.YELLOW);
        
        linearLayout.addView(tv2, new  LinearLayout.LayoutParams(FP, WC, 0f));
    }

}


