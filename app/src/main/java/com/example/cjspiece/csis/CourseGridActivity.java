package com.example.cjspiece.csis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseGridActivity extends AppCompatActivity {

    private boolean chartShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_grid);
    }

    public void showPlanChart(View view) {

        if(!chartShown) {
            chartShown = true;
            ImageView imgView = (ImageView) findViewById(R.id.plan_img);
            imgView.setVisibility(View.VISIBLE);
        }
        else {
            chartShown = false;
            ImageView imgView = (ImageView) findViewById(R.id.plan_img);
            imgView.setVisibility(View.GONE);
        }

    }

    public void backToMain(View view) {
        finish();
    }
}
