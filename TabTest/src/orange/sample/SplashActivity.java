package orange.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        
        //Honeycomb以上か判定
        boolean isHoneycomb = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
        
        if(isHoneycomb){
            Handler handler = new Handler();
            //Runnableを300ミリ秒後に一回だけ実行する
            handler.postDelayed(new splashHoneycombHandler(), 300);
        
        }else{
            Handler handler = new Handler();
            //Runnableを300ミリ秒後に一回だけ実行する
            handler.postDelayed(new splashOldHandler(), 300);
        }
    }
    class splashHoneycombHandler implements Runnable {
        public void run() {
                Intent i = new Intent(getApplication(), TabHoneycombActivity.class);
                startActivity(i);
                SplashActivity.this.finish();

            }
    }
    
    class splashOldHandler implements Runnable {
        public void run() {
                Intent i = new Intent(getApplication(), TabOldVersionActivity.class);
                startActivity(i);
                SplashActivity.this.finish();
            }
    }
}