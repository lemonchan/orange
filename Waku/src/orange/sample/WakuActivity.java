package orange.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WakuActivity extends Activity {
    
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.WHITE);
        setContentView(linearLayout);
        
        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setBackgroundColor(Color.WHITE);
        
        String[] array = {"レモン","みかん","リンゴ","さくらんぼ"};
        
        int num = array.length;
       
        for (int i = 0; i < num; i++) {
            
            //1行の場合
            if( num == 1 ){
                //マージンを設定して、背景色の違いで枠らしくみせます。
                
                //全体の背景を赤
                LinearLayout backLayout = new LinearLayout(this);
                backLayout.setOrientation(LinearLayout.VERTICAL);
                backLayout.setBackgroundColor(Color.RED);
                
                //マージン
                LinearLayout.LayoutParams params = new TableLayout.LayoutParams(FP, WC);
                params.setMargins(5, 5, 5, 5);//left, top, right, bottom
                
                //テキストビューの背景は白
                TextView tv = new TextView(this);
                tv.setBackgroundColor(Color.WHITE);
                tv.setTextSize(30);
                tv.setText(array[i]);
                
                //行にテキストビューを追加
                TableRow tableRow = new TableRow(this);
                tableRow.addView(tv);

                // テーブルに行を追加
                backLayout.addView(tableRow, params);
                tableLayout.addView(backLayout, new TableLayout.LayoutParams(FP, WC));
                
            }else{
                //2行以上の場合
                
                //全体の背景を赤
                LinearLayout backLayout = new LinearLayout(this);
                backLayout.setOrientation(LinearLayout.VERTICAL);
                backLayout.setBackgroundColor(Color.RED);
                
                LinearLayout.LayoutParams params = new TableLayout.LayoutParams(FP, WC);
                
                //マージンの設定
                if(i==num-1){
                    //最後の行
                    params.setMargins(5, 5, 5, 5);
                }else{
                    params.setMargins(5, 5, 5, 0);
                }
                
                //テキストビューの背景は白
                TextView tv = new TextView(this);
                tv.setBackgroundColor(Color.WHITE);
                tv.setTextSize(30);
                tv.setText(array[i]);
                
                //行にテキストビューを追加
                TableRow tableRow = new TableRow(this);
                tableRow.addView(tv);
                
                // テーブルに行を追加
                backLayout.addView(tableRow, params);
                tableLayout.addView(backLayout, new TableLayout.LayoutParams(FP, WC));
                
            }
            
        }
        
    linearLayout.addView(tableLayout, new LinearLayout.LayoutParams(FP, WC));
}
}
