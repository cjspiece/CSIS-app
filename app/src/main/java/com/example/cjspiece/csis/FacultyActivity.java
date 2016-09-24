package com.example.cjspiece.csis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FacultyActivity extends AppCompatActivity {

    private boolean choBioShown= false;
    private boolean corserBioShown = false;
    private boolean rahmanBioShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
    }

    // Shows the biography for the given professor
    public void showChoBio(View view) {
        if(!choBioShown) {
            TextView textView = (TextView) findViewById(R.id.choBiography);
            textView.setVisibility(View.VISIBLE);
            choBioShown = true;
        }
        else {
            choBioShown = false;
            TextView textView = (TextView) findViewById(R.id.choBiography);
            textView.setVisibility(View.GONE);
        }
    }

    // Shows the biography for the given professor
    public void showCorserBio(View view) {
        if(!corserBioShown) {
            TextView textView = (TextView) findViewById(R.id.corserBiography);
            textView.setVisibility(View.VISIBLE);
            corserBioShown = true;
        }
        else {
            corserBioShown = false;
            TextView textView = (TextView) findViewById(R.id.corserBiography);
            textView.setVisibility(View.GONE);
        }
    }

    // Shows the biography for the given professor
    public void showRahmanBio(View view) {
        if(!rahmanBioShown) {
            TextView textView = (TextView) findViewById(R.id.rahmanBiography);
            textView.setVisibility(View.VISIBLE);
            rahmanBioShown = true;
        }
        else {
            rahmanBioShown = false;
            TextView textView = (TextView) findViewById(R.id.rahmanBiography);
            textView.setVisibility(View.GONE);
        }
    }

    public void backToMain(View view) {
        finish();
    }

}
