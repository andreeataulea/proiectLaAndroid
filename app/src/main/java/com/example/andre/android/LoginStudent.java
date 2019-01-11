package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;

public class LoginStudent extends AppCompatActivity {

    public static final  String Extra_nume = "com.example.andre.android.Extra_nume";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        final EditText editTextStud = (EditText)findViewById(R.id.editTextEmailStudent);
        CardView sendButton = (CardView) findViewById(R.id.loginStud);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActionIntraStud();
            }

        });
    }

    public void ActionIntraStud() {
        EditText editText = (EditText)findViewById(R.id.editTextEmailStudent);
        String text = editText.getText().toString();

        Intent intent = new Intent(LoginStudent.this, DashboardStudent.class);
        intent.putExtra(Extra_nume,text);
        startActivity(intent);
    }
}
