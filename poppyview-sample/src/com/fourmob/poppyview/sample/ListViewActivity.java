package com.fourmob.poppyview.sample;

import com.fourmob.poppyview.PoppyViewHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ListViewActivity extends Activity {

	private PoppyViewHelper mPoppyViewHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);

		mPoppyViewHelper = new PoppyViewHelper(this);
		mPoppyViewHelper.createPoppyViewOnListView(R.id.listView1, R.layout.poppyview);

		final ListView listView1 = (ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new BaseAdapter() {

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				if(convertView == null) {
					convertView = getLayoutInflater().inflate(android.R.layout.simple_list_item_1, null);
				}
				((TextView)convertView.findViewById(android.R.id.text1)).setText(getItem(position));
				return convertView;
			}

			@Override
			public long getItemId(int position) {
				return position;
			}

			@Override
			public String getItem(int position) {
				return "text" + position;
			}

			@Override
			public int getCount() {
				return 15;
			}
		});
	}

}
