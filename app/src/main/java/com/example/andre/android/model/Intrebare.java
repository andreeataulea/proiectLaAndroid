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
        sb.append(", ");
        sb.append(raspuns1);
        sb.append(", ");
        sb.append(raspuns2);
        sb.append(", ");
        sb.append(raspuns3);
        sb.append(", ");
        sb.append(raspuns4);
        return  sb.toString();
    }

    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String getRaspuns1() {
        return raspuns1;
    }

    public void setRaspuns1(String raspuns1) {
        this.raspuns1 = raspuns1;
    }

    public String getRaspuns2() {
        return raspuns2;
    }

    public void setRaspuns2(String raspuns2) {
        this.raspuns2 = raspuns2;
    }

    public String getRaspuns3() {
        return raspuns3;
    }

    public void setRaspuns3(String raspuns3) {
        this.raspuns3 = raspuns3;
    }

    public String getRaspuns4() {
        return raspuns4;
    }

    public void setRaspuns4(String raspuns4) {
        this.raspuns4 = raspuns4;
    }
}
