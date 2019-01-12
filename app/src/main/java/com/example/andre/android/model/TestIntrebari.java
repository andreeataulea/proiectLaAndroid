package com.example.andre.android.model;

import java.util.ArrayList;

public class TestIntrebari {
    private String cod;
    private ArrayList<Intrebare> setIntrebari;
    private String raspuns;

    public TestIntrebari(String cod, ArrayList<Intrebare> setIntrebari, String raspuns) {
        this.cod = cod;
        this.setIntrebari = new ArrayList<Intrebare>();
        for(int i=0;i<setIntrebari.size();i++){
            this.setIntrebari.add(new Intrebare(setIntrebari.get(i).getIntrebare(),setIntrebari.get(i).getRaspuns1(),setIntrebari.get(i).getRaspuns2(),setIntrebari.get(i).getRaspuns3(),setIntrebari.get(i).getRaspuns4()));
        }
        this.raspuns = raspuns;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public ArrayList<Intrebare> getSetIntrebari() {
        return setIntrebari;
    }

    public String getRaspuns() {
        return raspuns;
    }

    public void setRaspuns(String raspuns) {
        this.raspuns = raspuns;
    }

    public void setSetIntrebari(ArrayList<Intrebare> setIntrebari) {
        for(int i=0;i<setIntrebari.size();i++){new Intrebare(setIntrebari.get(i).getIntrebare(),setIntrebari.get(i).getRaspuns1(),setIntrebari.get(i).getRaspuns2(),setIntrebari.get(i).getRaspuns3(),setIntrebari.get(i).getRaspuns4());
        }
    }

    @Override
    public String toString() {
        return "TestIntrebari{" +
                "cod='" + cod + '\'' +
                ", setIntrebari=" + setIntrebari +
                ", raspuns='" + raspuns + '\'' +
                '}';
    }
}