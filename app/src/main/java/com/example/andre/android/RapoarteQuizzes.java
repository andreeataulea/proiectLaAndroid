package com.example.andre.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.example.andre.android.model.RaportQuizz;

import java.util.ArrayList;

public class RapoarteQuizzes extends AppCompatActivity {

    private static final String TAG="RapoarteQuizzes";
    private ListView mListView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports_quizz);

        Log.d(TAG,"onCreate: Started");
        mListView=(ListView)findViewById(R.id.lvRaportsQuizz);

        RaportQuizz q1=new RaportQuizz("Quiz1","Q1","80");
        RaportQuizz q2=new RaportQuizz("Quiz2","Q2","90");
        RaportQuizz q3=new RaportQuizz("Quiz3","Q3","85");
        RaportQuizz q4=new RaportQuizz("Quiz4","Q4","75");
        RaportQuizz q5=new RaportQuizz("Quiz5","Q5","95");
        RaportQuizz q6=new RaportQuizz("Quiz6","Q6","80");
        RaportQuizz q7=new RaportQuizz("Quiz7","Q7","65");
        RaportQuizz q8=new RaportQuizz("Quiz8","Q8","75");
        RaportQuizz q9=new RaportQuizz("Quiz9","Q9","100");
        RaportQuizz q10=new RaportQuizz("Quiz10","Q10","95");

        ArrayList<RaportQuizz> rapoarteList=new ArrayList<>();
        rapoarteList.add(q1);
        rapoarteList.add(q2);
        rapoarteList.add(q3);
        rapoarteList.add(q4);
        rapoarteList.add(q5);
        rapoarteList.add(q6);
        rapoarteList.add(q7);
        rapoarteList.add(q8);
        rapoarteList.add(q9);
        rapoarteList.add(q10);

    }
}
