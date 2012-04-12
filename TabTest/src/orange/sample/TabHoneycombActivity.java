package orange.sample;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class TabHoneycombActivity extends Activity implements ActionBar.TabListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeycombmain);

        final ActionBar bar = getActionBar();
        
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.setDisplayShowHomeEnabled(false);
        bar.setDisplayShowTitleEnabled(false);
        bar.addTab(bar.newTab().setText(R.string.tab1).setTabListener(this));
        bar.addTab(bar.newTab().setText(R.string.tab2).setTabListener(this));
        bar.addTab(bar.newTab().setText(R.string.tab3).setTabListener(this));
        bar.addTab(bar.newTab().setText(R.string.tab4).setTabListener(this));
        bar.addTab(bar.newTab().setText(R.string.tab5).setTabListener(this));
        
    }
    
    private Fragment ft1 = new FragmentOne();
    private Fragment ft2 = new FragmentTwo();
    private Fragment ft3 = new FragmentThree();
    private Fragment ft4 = new FragmentFour();
    private Fragment ft5 = new FragmentFive();
    
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }
 
    /** タブが選択されたときの処理 */
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        
        if(tab.getText().equals("スクリーン1")){
            ft.add(R.id.honeycombmain, ft1);
        }
        
        if(tab.getText().equals("スクリーン2")){
            ft.add(R.id.honeycombmain, ft2);
        }
        if(tab.getText().equals("スクリーン3")){
            ft.add(R.id.honeycombmain, ft3);
        }
        if(tab.getText().equals("スクリーン4")){
            ft.add(R.id.honeycombmain, ft4);
        }
        if(tab.getText().equals("スクリーン5")){
            ft.add(R.id.honeycombmain, ft5);
        }
    }
 
    /** タブの選択が移ったときの処理 */
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        if(tab.getText().equals("スクリーン1")){
            ft.remove(ft1);
        }
        if(tab.getText().equals("スクリーン2")){
            ft.remove(ft2);
        }
        if(tab.getText().equals("スクリーン3")){
            ft.remove(ft3);
        }
        if(tab.getText().equals("スクリーン4")){
            ft.remove(ft4);
        }
        if(tab.getText().equals("スクリーン5")){
            ft.remove(ft5);
        }
        
    }
    
    
}
    