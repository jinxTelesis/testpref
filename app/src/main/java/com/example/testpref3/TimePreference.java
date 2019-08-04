package com.example.testpref3;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.DialogPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

// todo this is the TimePreference // extends DialogPreference
// think the other stackoverflow is correct with the extra overrides
public class TimePreference extends DialogPreference {

    private AlertDialog.Builder mBuilder;
    private int mDialogLayoutResId;


    public TimePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public TimePreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TimePreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimePreference(Context context) {
        super(context);
    }

    // todo override all 3
    // //todo done 1 constructors done // might need setPersistent(false) // if you want to inflate from a resource setDialogLayoutResource(int dialogLayoutResId)
    // //todo sorta done 2 onBindDialogView called need to call super or figure out this annotation
    // //todo persisted posative results

    protected void onBindDialogView(View view) {
        View dialogMessageView = view.findViewById(android.R.id.message);

        if (dialogMessageView != null) {
            final CharSequence message = getDialogMessage();
            int newVisibility = View.GONE;

            if (!TextUtils.isEmpty(message)) {
                if (dialogMessageView instanceof TextView) {
                    ((TextView) dialogMessageView).setText(message);
                }

                newVisibility = View.VISIBLE;
            }

            if (dialogMessageView.getVisibility() != newVisibility) {
                dialogMessageView.setVisibility(newVisibility);
            }
        }
        super.onBindDialogView(dialogMessageView);
    }

    protected View onCreateDialogView() {
        if (mDialogLayoutResId == 0) {
            return null;
        }

        LayoutInflater inflater = LayoutInflater.from(mBuilder.getContext());
        return inflater.inflate(mDialogLayoutResId, null);
    }


    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
    }

    //todo prob don't have to do this
//    @Override
//    protected void onDialogClosed(boolean positiveResult) {
//        super.onDialogClosed(positiveResult);
//
//        if (positiveResult) {
//            Editor editor = getEditor();
//            editor.putString(myKey1, myView.getValue1());
//            editor.putString(myKey2, myView.getValue2());
//            editor.commit();
//        }
//    }

}