package co.squack.squack;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    SliderPagerAdapter mSliderPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

        setContentView(R.layout.activity_main);

        mSliderPagerAdapter = new SliderPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSliderPagerAdapter);
        mViewPager.setCurrentItem(1);

    }
//dank
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume () {
        super.onResume();
    }

    public void openSettings () {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}