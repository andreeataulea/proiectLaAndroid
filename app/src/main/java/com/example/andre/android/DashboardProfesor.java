package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DashboardProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_profesor);

        TextView editTextProf = (TextView) findViewById(R.id.textGridProf);

        Intent intent = getIntent();

        String mail = intent.getStringExtra("myemail");

        editTextProf.setText(mail);
    }

    public void ActionMyquizzes(View view) {
        Intent intent = new Intent(DashboardProfesor.this, my_quizzes.class);
        startActivity(intent);
    }

    public void ActionCreeazaTest(View view) {
        Intent intent = new Intent(DashboardProfesor.this, create_quizz.class);
        startActivity(intent);
    }

    public void ActionRapoarte(View view) {
        Intent intent = new Intent(DashboardProfesor.this, reports.class);
        startActivity(intent);
    }
}
