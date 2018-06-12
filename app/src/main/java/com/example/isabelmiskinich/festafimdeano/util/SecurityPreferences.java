package com.example.isabelmiskinich.festafimdeano.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by isabel miskinich on 12/02/2018.
 */

public class SecurityPreferences {
    private final SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context context) {

        this.mSharedPreferences = context.getSharedPreferences("FimDeAno", Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value) {

        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoreString(String key) {

        return this.mSharedPreferences.getString(key, "");
    }
}
