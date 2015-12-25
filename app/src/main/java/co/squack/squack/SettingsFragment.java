package co.squack.squack;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;


public class SettingsFragment extends PreferenceFragment
        implements SharedPreferences.OnSharedPreferenceChangeListener {

    public static String status = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

    @Override
    public void onResume() {
        super.onResume();
        Preference statusPref = findPreference("user_status");
        statusPref.setSummary(status);
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onPause () {
        super.onPause();
        //TODO: save status, then call from it in onResume()
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged (SharedPreferences sharedPreferences, String key) {
        if (key.equals("user_status")) {
            Preference statusPref = findPreference(key);
            statusPref.setSummary(sharedPreferences.getString(key, ""));
            status = sharedPreferences.getString(key, "");
        }
    }

}
