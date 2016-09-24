package com.example.cjspiece.csis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourseGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_grid);
    }

    public void backToMain(View view) {
        finish();
    }
}
