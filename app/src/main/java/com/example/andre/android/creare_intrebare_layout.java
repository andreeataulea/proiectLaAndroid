package com.example.andre.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andre.android.model.Intrebare;

public class creare_intrebare_layout extends Activity {
    private Button add;
    private EditText intrebare;
    private EditText raspuns1;
    private EditText raspuns2;
    private EditText raspuns3;
    private EditText raspuns4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creare_intrebare_layout);
        add = (Button) findViewById(R.id.adaugaIntrebareButton);

       /* add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(creare_intrebare_layout.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_dialog1, null);
                @SuppressLint("WrongViewCast") EditText r1 = (EditText) mView.findViewById(R.id.adaugaIntrebareB1);
            }
        });*/

        intrebare = findViewById(R.id.intrebareEditText);
        raspuns1 = findViewById(R.id.adaugaIntrebareB1);
        raspuns2 = findViewById(R.id.adaugaIntrebareB2);
        raspuns3 = findViewById(R.id.adaugaIntrebareB3);
        raspuns4 = findViewById(R.id.adaugaIntrebareB4);

    }

    public void adaugaIntrebare(View view) {
        if (intrebare != null) {
            if ("".equals(intrebare.getText().toString()) || "".equals(raspuns1.getText().toString()) || "".equals(raspuns2.getText().toString())) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Error");
                builder.setMessage("Completarea intrebarii si primele doua campuri cu raspunsuri sunt obligatorii!");
                builder.setPositiveButton("Ok", null);
                AlertDialog dialog = builder.create();
            } else {
                Intrebare intrebareNoua = new Intrebare(intrebare.getText().toString(),
                        raspuns1.getText().toString(),
                        raspuns2.getText().toString(),
                        raspuns3.getText().toString(),
                        raspuns4.getText().toString());
                Intent intent = new Intent();
                intent.putExtra("intrebare", intrebareNoua);
                setResult(RESULT_OK, intent);
                finish();
            }
        }
            else{
                Toast.makeText(creare_intrebare_layout.this, "Camp intrebare gol!", Toast.LENGTH_SHORT).show();
            }
        }
    }
