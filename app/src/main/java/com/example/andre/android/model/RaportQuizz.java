package com.example.andre.android.model;

import java.io.Serializable;

public class RaportQuizz implements Serializable {
   private String numeTestR;
   private String codTestR;
   private String punctaj;
   private String materie;
   private String numeStudent;

   public RaportQuizz ( String numeTestR,String codTestR, String punctaj, String materie, String numeStudent){
       this.numeTestR=numeTestR;
       this.codTestR=codTestR;
       this.punctaj=punctaj;
       this.materie = materie;
       this.numeStudent=numeStudent;
   }

   public String  getNumeTestR(){return numeTestR;}
   public String getCodTestR(){return codTestR;}
   public String getPunctaj(){return punctaj;}
   public String getMaterie(){return materie;}
   public String getNumeStudent(){return numeStudent;}

   public void setNumeTestR(String numeTestR){this.numeTestR=numeTestR;}
   public void setCodTestR(String codTestR){this.codTestR=codTestR;}
   public void setPunctaj(String punctaj){this.punctaj=punctaj;}

    public void setMaterie(String materie) {
        this.materie = materie;
    }
    public void setNumeStudent(String numeStudent){this.numeStudent=numeStudent;}

    public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append(numeTestR);
       sb.append(", ");
       sb.append(codTestR);
       sb.append(", ");
       sb.append(punctaj);
        sb.append(", ");
        sb.append(numeStudent);
       return sb.toString();

   }

}
