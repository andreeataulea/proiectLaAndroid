package com.example.andre.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeQuizz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quizz);
        final EditText editText = (EditText)findViewById(R.id.edCodTestStud);
        Button sendButton = (Button)findViewById(R.id.btnStart);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cod = Integer.parseInt(editText.getText().toString());

                Intent intent = new Intent(getApplicationContext(),TestCurentStudent.class);

                intent.putExtra("mycode",cod);

                startActivity(intent);
            }
        });
    }


    public void ActionTestCurent(View view) {
        Intent intent = new Intent(TakeQuizz.this, TestCurentStudent.class);
        startActivity(intent);
    }
}
