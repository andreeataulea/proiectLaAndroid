package com.example.andre.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class my_quizzes_layout extends Activity {
    String[] quizzes={"Test 1", "Test 2", "Test 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_quizzes_layout);


    }
}
