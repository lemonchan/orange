package orange.sample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FragmentThree extends Fragment {
        @Override
          public View onCreateView(LayoutInflater inflater,
                                  ViewGroup container, Bundle savedInstanceState) {
              LinearLayout v = (LinearLayout) inflater.inflate(R.layout.screenthree, null, false);
              return v;
          }
	
}