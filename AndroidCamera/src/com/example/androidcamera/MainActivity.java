package com.example.androidcamera;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabHost tabHost = getTabHost();

		TabSpec tabSpec = tabHost.newTabSpec("tab1");
		tabSpec.setIndicator("Tab 1");
		tabHost.addTab(tabSpec);

		tabSpec = tabHost.newTabSpec("tab2");
		tabSpec.setIndicator("Tab 2");
		tabHost.addTab(tabSpec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
