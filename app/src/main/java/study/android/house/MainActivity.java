package study.android.house;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	View toolBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		toolBox = findViewById(R.id.toolbox);
	}
	public void showSettings(View v)
	{
        if (toolBox.getVisibility()==View.GONE)
        	toolBox.setVisibility(View.VISIBLE);
		else
			toolBox.setVisibility(View.GONE);
	}
}
