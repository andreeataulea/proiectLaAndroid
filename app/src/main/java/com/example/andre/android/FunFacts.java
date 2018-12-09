package com.example.andre.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.CardView;

public class FunFacts extends AppCompatActivity {
    public static TextView data;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfacts);

        data=(TextView)findViewById(R.id.fetcheddata);
        fetchData process=new fetchData();
        process.execute();
    }

}
