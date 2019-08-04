package com.example.testpref3;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.preference.PreferenceDialogFragmentCompat;


// this is the last part which calls the fragment? // this is the one that needs to do the call
public class TimePreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    protected static final String ARG_KEY = "key";
    private @LayoutRes int mDialogLayoutRes = R.layout.pref_dialog;



    // this is avoiding the on create
    public static TimePreferenceDialogFragmentCompat newInstance(String key) {
        final TimePreferenceDialogFragmentCompat
                fragment = new TimePreferenceDialogFragmentCompat();
        Bundle b = new Bundle(10);

        b.putString(ARG_KEY, key);
        fragment.setArguments(b);
        return fragment;
    }

    protected View onCreateDialogView(Context context) {
        final int resId = mDialogLayoutRes;
        if (resId == 0) {
            return null;
        }

        LayoutInflater inflater = LayoutInflater.from(context);

        return inflater.inflate(resId, null);
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


        view.setBackgroundColor(206);
        view.setBackgroundResource(R.drawable.ic_launcher_background);
        super.onBindDialogView(view);


    }

    @Override //todo might have to make changes when it saves
    public void onDialogClosed(boolean positiveResult) {
    }

}
