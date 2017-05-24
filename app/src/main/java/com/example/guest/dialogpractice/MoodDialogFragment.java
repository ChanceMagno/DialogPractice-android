package com.example.guest.dialogpractice;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * Created by Guest on 5/24/17.
 */

public class MoodDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        getDialog().setTitle("Simple Dialog");

        Button subButt = (Button) rootView.findViewById(R.id.submitButton);
        Button canButt = (Button) rootView.findViewById(R.id.cancelButton);



        canButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        subButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup);
                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();
            }
        });

        return rootView;
    }

}

