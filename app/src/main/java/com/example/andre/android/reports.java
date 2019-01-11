package com.example.andre.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.andre.android.adapters.ReportAdapter;
import com.example.andre.android.model.RaportQuizz;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class reports extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        Log.d(TAG,"onCreate: Started.");
        ListView mListView = (ListView)findViewById(R.id.lvRapoarte);

        RaportQuizz q1 = new RaportQuizz("Maria","100","60","Java");
        RaportQuizz q2 = new RaportQuizz("Mara","101","65","SDD");
        RaportQuizz q3 = new RaportQuizz("Ana","102","90","Java");
        RaportQuizz q4 = new RaportQuizz("Mia","103","79","PAW");
        RaportQuizz q5 = new RaportQuizz("Robert","104","90","Android");

        ArrayList<RaportQuizz> lista = new ArrayList<RaportQuizz>();
        lista.add(q1);
        lista.add(q2);
        lista.add(q3);
        lista.add(q4);
        lista.add(q5);

        ReportAdapter adapter = new ReportAdapter(this, R.layout.adapter_view_quizz_report, lista);
        mListView.setAdapter(adapter);
    }
}
