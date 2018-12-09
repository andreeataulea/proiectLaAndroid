package com.example.andre.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFacts extends AppCompatActivity {
    Button click;
    public static TextView data;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfacts);

        click=(Button) findViewById(R.id.funFact);
        data=(TextView)findViewById(R.id.fetcheddata);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData process=new fetchData();
                process.execute();

            }
        });
    }

}
