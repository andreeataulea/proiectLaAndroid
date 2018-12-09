package com.example.andre.android.model;

import java.io.Serializable;

public class RaportQuizz implements Serializable {
   private String numeTestR;
   private String codTestR;
   private String punctaj;

   public RaportQuizz (String numeTestR, String nucodTestRmeS, String punctaj){
       this.numeTestR=numeTestR;
       this.codTestR=codTestR;
       this.punctaj=punctaj;
   }

   public String  getNumeTestR(){return numeTestR;}
   public String getCodTestR(){return codTestR;}
   public String getPunctaj(){return punctaj;}

   public void setNumeTestR(String numeTestR){this.numeTestR=numeTestR;}
   public void setCodTestR(String codTestR){this.codTestR=codTestR;}
   public void setPunctaj(String punctaj){this.punctaj=punctaj;}

   public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append(numeTestR);
       return sb.toString();
   }

}
