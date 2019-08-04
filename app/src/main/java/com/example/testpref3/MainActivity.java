package com.example.testpref3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Fragment preferenceFragment = new PreferenceFragmentCustom();
            Fragment otherPreferenceFragment = new OtherPreferenceFragmentCustom();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.pref_container, preferenceFragment);
            //ft.add(R.id.pref_container,otherPreferenceFragment);
            ft.commit();
        }
    }
}
