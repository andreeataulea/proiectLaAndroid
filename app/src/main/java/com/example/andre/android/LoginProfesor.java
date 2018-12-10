package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;

public class LoginProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_profesor);



    }

    public void ActionRegProf(View view) {
        Intent intent = new Intent(LoginProfesor.this, RegisterProfesor.class);
        startActivity(intent);
    }
}
