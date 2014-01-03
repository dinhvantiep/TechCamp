package com.example.androidcamera;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MyBrowser extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		TabHost tabHost = getTabHost();

		TabSpec tabSpec = tabHost.newTabSpec("tab1");
		tabSpec.setIndicator("Tab 1");
		tabHost.addTab(tabSpec);

		tabSpec = tabHost.newTabSpec("tab2");
		tabSpec.setIndicator("Tab 2");
		tabHost.addTab(tabSpec);

	}
}
