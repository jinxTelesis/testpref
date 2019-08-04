package com.example.testpref3;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class PreferenceFragmentCustom extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.app_preference_screen); //todo remove

    }

    @Override
    public void onDisplayPreferenceDialog(Preference preference) {

        DialogFragment dialogFragment = null;
        dialogFragment = TimeDataPreferenceDialogFragmentCompat.newInstance(preference.getKey());
        //todo might need to bring that bad, this might override all fragments always


        if (dialogFragment != null) {
            // The dialog was created (it was one of our custom Preferences), show the dialog for it
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(this.getFragmentManager(), "android.support.preference" +
                    ".PreferenceFragment.DIALOG2");
        } else {
            // Dialog creation could not be handled here. Try with the super method.
            super.onDisplayPreferenceDialog(preference);
        }
    }
}
