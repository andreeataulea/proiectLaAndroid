package com.example.andre.android.model;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.andre.android.R;

import java.io.Serializable;

import static android.app.PendingIntent.getActivity;

public class Quizz extends Activity implements Serializable  {
    private String numeTest;
    private String codTest;
    private String tipTest;
    private Spinner spinnerMaterii = (Spinner) findViewById(R.id.spinnerMaterie);
    private String materie=spinnerMaterii.getSelectedItem().toString();

    public Quizz (String numeTest, String codTest, String tipTest,String materie){
        this.numeTest=numeTest;
        this.codTest=codTest;
        this.tipTest=tipTest;
        this.materie=materie;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(numeTest);
        sb.append(", ");
        sb.append(codTest);
        sb.append(", ");
        sb.append(tipTest);
        sb.append(", ");
        sb.append(materie);
        return sb.toString();

    }

    public String getNumeTest(){return numeTest;}
    public String getTipTest(){return tipTest;}
    public String getCodTest(){return  codTest;}
    public String getMaterie(){return materie;}

    public void setNumeTest(String numeTest){this.numeTest=numeTest;}
    public void setCodTest(String codTest){this.codTest=codTest;}
    public void setTipTest(String tipTest){this.tipTest=tipTest;}
    public void setMaterie(String materie){this.materie=materie;}
}
