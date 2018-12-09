package com.example.andre.android.model;

import java.io.Serializable;

public class Quizz implements Serializable {
    private String numeTest;
    private String codTest;
    private String tipTest;

    public Quizz (String numeTest, String codTest, String tipTest){
        this.numeTest=numeTest;
        this.codTest=codTest;
        this.tipTest=tipTest;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(numeTest);
        return sb.toString();
    }

    public String getNumeTest(){return numeTest;}
    public String getTipTest(){return tipTest;}
    public String getCodTest(){return  codTest;}

    public void setNumeTest(String numeTest){this.numeTest=numeTest;}
    public void setCodTest(String codTest){this.codTest=codTest;}
    public void setTipTest(String tipTest){this.tipTest=tipTest;}
}
