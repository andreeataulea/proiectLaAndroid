package com.example.andre.android.model;

import java.io.Serializable;

public class Intrebare implements Serializable {
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private String raspuns4;

    public Intrebare (String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4){
        this.intrebare=intrebare;
        this.raspuns1=raspuns1;
        this.raspuns2=raspuns2;
        this.raspuns3=raspuns3;
        this.raspuns4=raspuns4;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(intrebare);
        return  sb.toString();
    }

}
