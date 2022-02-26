package com.example.miejercicio1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class utilitarios {

    public static void setDefaultsPreference(String key, String value, Context context) {
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preference.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getDefaultsPreference(String key, Context context) {
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(context);
        return preference.getString(key, null);
    }



}
