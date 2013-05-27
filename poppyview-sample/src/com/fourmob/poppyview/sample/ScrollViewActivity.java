package com.fourmob.poppyview.sample;

import android.app.Activity;
import android.os.Bundle;

import com.fourmob.poppyview.PoppyViewHelper;


public class ScrollViewActivity extends Activity {

	private PoppyViewHelper mPoppyViewHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollview);

		mPoppyViewHelper = new PoppyViewHelper(this);
		mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);
	}
}
