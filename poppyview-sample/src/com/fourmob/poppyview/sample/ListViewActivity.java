package com.fourmob.poppyview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.fourmob.poppyview.PoppyViewHelper;


public class ListViewActivity extends Activity {

	private static final String[] songs = { "1983... (A Merman I Should Turn to Be)", "51st Anniversary", "All Along The Watchtower", "Angel", "Are You Experienced?", "Bleeding Heart", "Bold As Love", "Burning Of The Midnight Lamp",
			"Castles Made Of Sand", "Crash Landing", "Crosstown Traffic", "Dolly Dagger", "Drifting", "Fire", "Foxy Lady", "Gypsy Eyes", "Hear My Train a Comin'", "Hey Joe", "Highway Chile", "House Burning Down", "Izabella", "Let Me Move You",
			"Little Wing", "Lover Man", "Machine Gun", "Manic Depression", "Mojo Man", "Mr. Bad Luck", "One Rainy Wish", "Purple Haze", "Red House", "She's So Fine", "Ships Passing In The Night", "Somewhere", "Spanish Castle Magic",
			"Stepping Stone", "Still Raining, Still Dreaming", "Stone Free", "The Wind Cries Mary", "Third Stone From The Sun", "Valleys of Neptune", "Voodoo Child (Slight Return)" };

	private PoppyViewHelper mPoppyViewHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);

		mPoppyViewHelper = new PoppyViewHelper(this);
		View poppyView = mPoppyViewHelper.createPoppyViewOnListView(R.id.listView1, R.layout.poppyview, new AbsListView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				Log.d("ListViewActivity", "onScrollStateChanged");
			}

			@Override
			public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
				Log.d("ListViewActivity", "onScroll");
			}
		});

		poppyView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(ListViewActivity.this, "Click me!", Toast.LENGTH_SHORT).show();
			}
		});

		final ListView listView1 = (ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new BaseAdapter() {

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				if(convertView == null) {
					convertView = getLayoutInflater().inflate(R.layout.listitem_song, null);
				}
				((TextView) convertView).setText(getItem(position));
				return convertView;
			}

			@Override
			public long getItemId(int position) {
				return songs[position].hashCode();
			}

			@Override
			public String getItem(int position) {
				return songs[position];
			}

			@Override
			public int getCount() {
				return songs.length;
			}
		});
	}

}
