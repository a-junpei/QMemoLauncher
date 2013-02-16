package jp.junpei1982;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);

		String packageName = "com.lge.QuickClip";
		String className = "com.lge.QuickClip.QuickClipActivity";

		Intent intent = new Intent();
		intent.setClassName(packageName, className);
		startActivity(intent);

		finish();
	}
}
