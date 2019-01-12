package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andre.android.model.TestIntrebari;

import java.util.ArrayList;

public class TestCurentStudent extends AppCompatActivity {

    private EditText intrebareStud;
    private TextView raspuns_1;
    private TextView raspuns_2;
    private TextView raspuns_3;
    private TextView raspuns_4;
    private ArrayList<TestIntrebari> listaTeste;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_curent_student);

        editText = (EditText)findViewById(R.id.editTextTest);

        Intent intent = getIntent();
        int cod = intent.getIntExtra(TakeQuizz.Extra_number,0);
        editText.setText(""+cod);

        listaTeste = new ArrayList<TestIntrebari>();
        //if(cod == )
    }
}
