package com.example.andre.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class creare_intrebare_layout extends Activity {
    private Button add;
    private TextView b;
    private TextView c;
    private TextView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creare_intrebare_layout);
        add = (Button) findViewById(R.id.adaugaIntrebareB1);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(creare_intrebare_layout.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_dialog1, null);
                @SuppressLint("WrongViewCast") EditText r1 = (EditText) mView.findViewById(R.id.adaugaIntrebareB1);
            }
        });
    }

}
