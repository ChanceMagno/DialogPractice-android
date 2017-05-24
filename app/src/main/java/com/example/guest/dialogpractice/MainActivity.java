package com.example.guest.dialogpractice;

//import android.support.v4.app.FragmentManager;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.moodButton) Button moodButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        moodButt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
        moodDialogFragment.show(fm, "Sample Fragment");
    }
}
