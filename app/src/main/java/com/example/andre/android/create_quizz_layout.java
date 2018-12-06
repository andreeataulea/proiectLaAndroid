package com.example.andre.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class create_quizz_layout extends Activity {
    private Button adaugaIntrebare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quizz_layout);

        adaugaIntrebare=(Button)findViewById(R.id.adaugaIntrebareButton);
        adaugaIntrebare.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openCreareIntrebare();
            }
        });
    }

    public void openCreareIntrebare(){
        Intent intent = new Intent(this, com.example.andre.android.creare_intrebare.class);
        startActivity(intent);
    }
}
