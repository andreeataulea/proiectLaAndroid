package com.example.andre.android.model;

public class Rezultate {
    public String codTest;
    private String nume_utilizator;
    private String punctaj;

    public String getCodTest() {
        return codTest;
    }

    public void setCodTest(String codTest) {
        this.codTest = codTest;
    }

    public String getNume_utilizator() {
        return nume_utilizator;
    }

    public void setNume_utilizator(String nume_utilizator) {
        this.nume_utilizator = nume_utilizator;
    }

    public String getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(String punctaj) {
        this.punctaj = punctaj;
    }

    public Rezultate(String codTest, String nume_utilizator, String punctaj) {
        this.codTest = codTest;
        this.nume_utilizator = nume_utilizator;
        this.punctaj = punctaj;
    }

    @Override
    public String toString() {
        return "Rezultate{" +
                "codTest='" + codTest + '\'' +
                ", nume_utilizator='" + nume_utilizator + '\'' +
                ", punctaj='" + punctaj + '\'' +
                '}';
    }
}