package edu.fsu.cs.mobile.example.fragmentdynamic;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
	{
		Bundle args = getArguments();
		
		TextView tv = new TextView(getActivity());
		tv.setText("select arg = " + args.getInt("selected"));
		
		
		return tv;
	}

}
