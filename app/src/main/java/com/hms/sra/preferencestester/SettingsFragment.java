package com.hms.sra.preferencestester;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.widget.Toast;


/**
 * Created by h on 2/6/2018.
 */

public class SettingsFragment extends PreferenceFragment implements
        SharedPreferences.OnSharedPreferenceChangeListener {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_layout);


    }

    @Override
    public void onStop() {
        super.onStop();
        // unregister the preference change listener
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        // register the preference change listener
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        //this handler is called after changing the preference value to update fields
        //according to new saved values





        Activity activity = getActivity();
        Toast.makeText(activity,key,Toast.LENGTH_LONG).show();
        //if (key.equals(getString(R.string.pref_location_key))) {
        //    // we've changed the location
        //    // Wipe out any potential PlacePicker latlng values so that we can use this text entry.
        //     SunshinePreferences.resetLocationCoordinates(activity);
        //    SunshineSyncUtils.startImmediateSync(activity);
        //} else if (key.equals(getString(R.string.pref_units_key))) {
        //     // units have changed. update lists of weather entries accordingly
        //    activity.getContentResolver().notifyChange(WeatherContract.WeatherEntry.CONTENT_URI, null);
        //}
        //Preference preference = findPreference(key);
        //if (null != preference) {
        //    if (!(preference instanceof CheckBoxPreference)) {
        ///       setPreferenceSummary(preference, sharedPreferences.getString(key, ""));
        //    }
        //}
    }
}
