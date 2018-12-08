package com.example.andre.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class create_quizz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quizz);

        Spinner spinnerMaterii = (Spinner)findViewById(R.id.spinnerMaterie);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.materii,android.R.layout.simple_expandable_list_item_1);

        spinnerMaterii.setAdapter(adapter);
    }
}
