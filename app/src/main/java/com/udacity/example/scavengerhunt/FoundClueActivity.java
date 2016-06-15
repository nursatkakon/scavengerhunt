package com.udacity.example.scavengerhunt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FoundClueActivity extends AppCompatActivity {

    String lastPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_clue);
        Intent intent = getIntent();
        Uri uri = intent.getData();                 // retrieve a Uri object instance or
        lastPath = uri.getLastPathSegment();  // retrieve the string representation of the URI
        TextView t = (TextView) findViewById(R.id.clueNum);
        t.setText("Found Clue"+" "+lastPath);


    }

    public void finish(View v){
        if (lastPath.equals("2")){
            Intent i = new Intent(this,WinActivity.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(this,CurrentClueActivity.class);
            startActivity(i);
        }
    }
}
