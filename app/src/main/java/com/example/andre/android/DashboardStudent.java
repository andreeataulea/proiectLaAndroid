package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class DashboardStudent extends AppCompatActivity {

    CardView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_student);
        TextView editTextStud = (TextView) findViewById(R.id.numeLogStudent);


        click=(CardView) findViewById(R.id.cardFacts);

        Intent intent = getIntent();
        String text = intent.getStringExtra(LoginStudent.Extra_nume);

        editTextStud.setText(text);


    }

    public void ActionIncepeTest(View view) {
        Intent intent = new Intent(DashboardStudent.this, TakeQuizz.class);
        startActivity(intent);
    }

    public void ActionRaportStud(View view) {
        Intent intent = new Intent(DashboardStudent.this, rezultat.class);
        startActivity(intent);
    }
}
