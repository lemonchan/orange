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
        
        String[] array = {"������","�݂���","�����S","��������"};
        
        int num = array.length;
       
        for (int i = 0; i < num; i++) {
            
            //1�s�̏ꍇ
            if( num == 1 ){
                //�}�[�W����ݒ肵�āA�w�i�F�̈Ⴂ�Řg�炵���݂��܂��B
                
                //�S�̂̔w�i���
                LinearLayout backLayout = new LinearLayout(this);
                backLayout.setOrientation(LinearLayout.VERTICAL);
                backLayout.setBackgroundColor(Color.RED);
                
                //�}�[�W��
                LinearLayout.LayoutParams params = new TableLayout.LayoutParams(FP, WC);
                params.setMargins(5, 5, 5, 5);//left, top, right, bottom
                
                //�e�L�X�g�r���[�̔w�i�͔�
                TextView tv = new TextView(this);
                tv.setBackgroundColor(Color.WHITE);
                tv.setTextSize(30);
                tv.setText(array[i]);
                
                //�s�Ƀe�L�X�g�r���[��ǉ�
                TableRow tableRow = new TableRow(this);
                tableRow.addView(tv);

                // �e�[�u���ɍs��ǉ�
                backLayout.addView(tableRow, params);
                tableLayout.addView(backLayout, new TableLayout.LayoutParams(FP, WC));
                
            }else{
                //2�s�ȏ�̏ꍇ
                
                //�S�̂̔w�i���
                LinearLayout backLayout = new LinearLayout(this);
                backLayout.setOrientation(LinearLayout.VERTICAL);
                backLayout.setBackgroundColor(Color.RED);
                
                LinearLayout.LayoutParams params = new TableLayout.LayoutParams(FP, WC);
                
                //�}�[�W���̐ݒ�
                if(i==num-1){
                    //�Ō�̍s
                    params.setMargins(5, 5, 5, 5);
                }else{
                    params.setMargins(5, 5, 5, 0);
                }
                
                //�e�L�X�g�r���[�̔w�i�͔�
                TextView tv = new TextView(this);
                tv.setBackgroundColor(Color.WHITE);
                tv.setTextSize(30);
                tv.setText(array[i]);
                
                //�s�Ƀe�L�X�g�r���[��ǉ�
                TableRow tableRow = new TableRow(this);
                tableRow.addView(tv);
                
                // �e�[�u���ɍs��ǉ�
                backLayout.addView(tableRow, params);
                tableLayout.addView(backLayout, new TableLayout.LayoutParams(FP, WC));
                
            }
            
        }
        
    linearLayout.addView(tableLayout, new LinearLayout.LayoutParams(FP, WC));
}
}
