package com.example.ratinglayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView iv_pic = (ImageView) findViewById(R.id.iv_pic);
		iv_pic.setBackgroundResource(R.drawable.recommend);
	}
}
