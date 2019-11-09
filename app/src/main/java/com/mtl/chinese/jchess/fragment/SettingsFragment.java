package com.mtl.chinese.jchess.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.mtl.chinese.jchess.R;

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.game_settings);
    }
}
