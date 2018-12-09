package com.example.andre.android.model;

public class Rezultate {
    public String codTest;
    public String materie;
    public String numeProfesor;
    public String punctaj;

    public Rezultate(String codTest, String materie, String numeProfesor, String punctaj) {
        this.codTest = codTest;
        this.materie = materie;
        this.numeProfesor = numeProfesor;
        this.punctaj = punctaj;
    }

    public Rezultate() {
    }

    public String getCodTest() {
        return codTest;
    }

    public String getMaterie() {
        return materie;
    }

    public String getNumeProfesor() {
        return numeProfesor;
    }

    public String getPunctaj() {
        return punctaj;
    }

    public void setCodTest(String codTest) {
        this.codTest = codTest;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public void setNumeProfesor(String numeProfesor) {
        this.numeProfesor = numeProfesor;
    }

    public void setPunctaj(String punctaj) {
        this.punctaj = punctaj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codTest);
        sb.append(", ");
        sb.append(materie);
        sb.append(", ");
        sb.append(numeProfesor);
        sb.append(", ");
        sb.append(punctaj);
        return sb.toString();

    }
}
