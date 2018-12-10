package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TestCurentStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_curent_student);

        EditText editText = (EditText)findViewById(R.id.editTextTest);

        Intent intent = getIntent();

        int cod = intent.getIntExtra(TakeQuizz.Extra_number,0);

        editText.setText(""+cod);
    }
}
