package com.example.testpref3;

import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceDialogFragmentCompat;


// this is the last part which calls the fragment? // this is the one that needs to do the call
public class TimeDataPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    protected static final String ARG_KEY = "key";



    // this is avoiding the on create
    public static TimeDataPreferenceDialogFragmentCompat newInstance(String key) {
        final TimeDataPreferenceDialogFragmentCompat
                fragment = new TimeDataPreferenceDialogFragmentCompat();
        Bundle b = new Bundle(10);

        b.putString(ARG_KEY, key);
        fragment.setArguments(b);
        return fragment;
    }


    //todo should make this actually change view
    @Override
    public void onBindDialogView(View view){

//        .setTitle(mDialogTitle)
//                .setIcon(mDialogIcon)
//                .setPositiveButton(mPositiveButtonText, this)
//                .setNegativeButton(mNegativeButtonText, this);

//        setPositiveButtonText(android.R.string.ok);
//        setNegativeButtonText(android.R.string.cancel);


        //TextView titleView = (TextView) view.findViewById(android.R.id.title);

        //titleView.setTextColor(Color.RED); // this has to be on onCreateView


        //view.setBackgroundColor(206);
        //view.setBackgroundResource(R.drawable.ic_launcher_background);
        super.onBindDialogView(view);


    }

    @Override //todo might have to make changes when it saves
    public void onDialogClosed(boolean positiveResult) {
    }

}
