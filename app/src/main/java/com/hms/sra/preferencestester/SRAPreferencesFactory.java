package com.hms.sra.preferencestester;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


/**
 * Created by h on 2/19/2018.
 */

public class SRAPreferencesFactory {
    public static String et_val;
    public static boolean cb_val;

    public static final void downLoadPrefs(Context context){
        SharedPreferences  sp = PreferenceManager.getDefaultSharedPreferences(context);
        et_val = sp.getString(context.getResources().getString(R.string.pref_edit_box_key),
                context.getResources().getString(R.string.pref_edit_box_default_value_sec));
        cb_val = sp.getBoolean(context.getResources().getString(R.string.pref_check_box_key),
                context.getResources().getBoolean(R.bool.pref_check_box_default_value));
    }
}
