package com.example.andre.android.model;

import java.io.Serializable;

public class RaportQuizz implements Serializable {
   private String numeTestR;
   private String codTestR;
   private String punctaj;
   private String materie;

   public RaportQuizz ( String numeTestR,String codTestR, String punctaj, String materie){
       this.numeTestR=numeTestR;
       this.codTestR=codTestR;
       this.punctaj=punctaj;
       this.materie = materie;
   }

   public String  getNumeTestR(){return numeTestR;}
   public String getCodTestR(){return codTestR;}
   public String getPunctaj(){return punctaj;}
   public String getMaterie(){return materie;}

   public void setNumeTestR(String numeTestR){this.numeTestR=numeTestR;}
   public void setCodTestR(String codTestR){this.codTestR=codTestR;}
   public void setPunctaj(String punctaj){this.punctaj=punctaj;}

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append(numeTestR);
       return sb.toString();
   }

}
