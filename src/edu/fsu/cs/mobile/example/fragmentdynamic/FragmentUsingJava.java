package edu.fsu.cs.mobile.example.fragmentdynamic;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FragmentUsingJava extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        MyFragment fragment = new MyFragment();
        Bundle extras = new Bundle();
        extras.putInt("selected", 15);
        fragment.setArguments(extras);

        trans.add(R.id.fragment_container, fragment);
        trans.commit();
    }
}