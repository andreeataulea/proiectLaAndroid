package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_student);
        TextView editTextStud = (TextView) findViewById(R.id.textGridStud);


        Intent intent = getIntent();

        String mail = intent.getStringExtra("myemailStud");

        editTextStud.setText(mail);
    }
}
