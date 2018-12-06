package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;

public class LoginStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        final EditText editTextStud = (EditText)findViewById(R.id.editTextEmailStudent);
        CardView sendButton = (CardView) findViewById(R.id.loginStud);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = editTextStud.getText().toString();

                Intent intent = new Intent(getApplicationContext(),TestCurentStudent.class);

                intent.putExtra("myemailStud",mail);

                startActivity(intent);
            }
        });
    }
}
