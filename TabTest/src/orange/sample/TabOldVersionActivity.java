package orange.sample;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class TabOldVersionActivity extends TabActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.oldversionmain);
    initTabs();
  }
  
  protected void initTabs(){
    
    Resources res = getResources();
      TabHost tabHost = getTabHost();
      TabHost.TabSpec spec;
      Intent intent;

      // Tab1
      intent = new Intent().setClass(this, ScreenOneActivity.class);
      spec = tabHost.newTabSpec("Tab1").setIndicator(
        getText(R.string.tab1), res.getDrawable(R.drawable.star))
        .setContent(intent);
      tabHost.addTab(spec);
      
      // Tab2
      intent = new Intent().setClass(this, ScreenTwoActivity.class);
      spec = tabHost.newTabSpec("Tab2").setIndicator(
              getText(R.string.tab2), res.getDrawable(R.drawable.star))
        .setContent(intent);
      tabHost.addTab(spec);
      
      // Tab3
      intent = new Intent().setClass(this, ScreenThreeActivity.class);
      spec = tabHost.newTabSpec("Tab3").setIndicator(
       getText(R.string.tab3), res.getDrawable(R.drawable.star))
        .setContent(intent);
      tabHost.addTab(spec);
      
      // Tab4
      intent = new Intent().setClass(this, ScreenFourActivity.class);
      spec = tabHost.newTabSpec("Tab4").setIndicator(
       getText(R.string.tab4), res.getDrawable(R.drawable.star))
        .setContent(intent);
      tabHost.addTab(spec);
      
      // Tab5
      intent = new Intent().setClass(this,  ScreenFiveActivity.class);
      spec = tabHost.newTabSpec("Tab5").setIndicator(
       getText(R.string.tab5), res.getDrawable(R.drawable.star))
        .setContent(intent);
      tabHost.addTab(spec);
          

      tabHost.setCurrentTab(0);

  }

}