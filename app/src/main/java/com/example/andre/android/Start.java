package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void ActionLogP(View view) {
        Intent intent = new Intent(Start.this, LoginProfesor.class);
        startActivity(intent);
    }

    public void ActionLogS(View view) {
        Intent intent = new Intent(Start.this, LoginStudent.class);
        startActivity(intent);
    }
}
