package com.example.cjspiece.csis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFacultyActivity(View view) {
        Intent intent = new Intent(this, FacultyActivity.class);
        startActivity(intent);
    }

    public void openCourseGridActivity(View view) {
        Intent intent = new Intent(this, CourseGridActivity.class);
        startActivity(intent);
    }
}
