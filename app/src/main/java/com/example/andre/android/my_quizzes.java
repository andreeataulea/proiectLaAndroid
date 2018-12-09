package com.example.andre.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.andre.android.adapters.QuizzesListAdapter;
import com.example.andre.android.model.Quizz;

import java.util.ArrayList;
import java.util.List;

public class my_quizzes extends Activity {
    private ListView lvQuizzes;
    private QuizzesListAdapter quizzAdapter;
    private List<Quizz> listaQuizz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_quizzes);

        lvQuizzes = (ListView)findViewById(R.id.listViewQuizzes);

        listaQuizz = new ArrayList<>();
        listaQuizz.add(new Quizz("Quiz 1","100","Privat"));
        listaQuizz.add(new Quizz("Quiz 2","101","Public"));
        listaQuizz.add(new Quizz("Quiz 3","102","Privat"));

        quizzAdapter = new QuizzesListAdapter(getApplicationContext(),listaQuizz);
        lvQuizzes.setAdapter(quizzAdapter);
    }
}
