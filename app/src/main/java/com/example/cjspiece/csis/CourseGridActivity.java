package com.example.cjspiece.csis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseGridActivity extends AppCompatActivity {

    private boolean cisChartShown = false;
    private boolean csChartShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_grid);
    }

    public void showCsPlanChart(View view) {
        if(!csChartShown) {
            csChartShown = true;
            ImageView csImgView = (ImageView) findViewById(R.id.cs_plan_img);
            csImgView.setVisibility(View.VISIBLE);
        }
        else {
            csChartShown = false;
            ImageView csImgView = (ImageView) findViewById(R.id.cs_plan_img);
            csImgView.setVisibility(View.GONE);
        }
    }

    public void showPlanChart(View view) {

        if(!cisChartShown) {
            cisChartShown = true;
            ImageView cisImgView = (ImageView) findViewById(R.id.plan_img);
            cisImgView.setVisibility(View.VISIBLE);
        }
        else {
            cisChartShown = false;
            ImageView cisImgView = (ImageView) findViewById(R.id.plan_img);
            cisImgView.setVisibility(View.GONE);
        }

    }

    public void backToMain(View view) {
        finish();
    }
}
