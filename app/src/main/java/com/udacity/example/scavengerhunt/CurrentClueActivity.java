package com.udacity.example.scavengerhunt;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.udacity.example.scavengerhunt.DataObjects.clue;

public class CurrentClueActivity extends AppCompatActivity {

    TextView mClueTextView;
    TextView mProgressTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sharedPrefs= PreferenceManager.getDefaultSharedPreferences(this);
        int indexOfClueIWantToSee=sharedPrefs.getInt("userCurrentClue",0);
        clue[] clues1=((FoundClueActivity)getApplication()).getClues();
        clue clue=clues1[indexOfClueIWantToSee];

        mClueTextView=(TextView) findViewById(R.id.clue_text_view);
        mProgressTextView=(TextView) findViewById(R.id.progress_text_view);
        mClueTextView.setText(clue.getClue());
        mProgressTextView.setText(clue.getId()+"/3");
    }
}
