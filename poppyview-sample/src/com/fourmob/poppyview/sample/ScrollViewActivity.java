package com.fourmob.poppyview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fourmob.poppyview.PoppyViewHelper;
import com.fourmob.poppyview.PoppyViewHelper.PoppyViewPosition;


public class ScrollViewActivity extends Activity {

	private PoppyViewHelper mPoppyViewHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollview);

		mPoppyViewHelper = new PoppyViewHelper(this, PoppyViewPosition.TOP);
		View poppyView = mPoppyViewHelper.createPoppyViewOnScrollView(R.id.scrollView, R.layout.poppyview);

		poppyView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(ScrollViewActivity.this, "Click me!", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
