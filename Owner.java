package com.mycompany.lab1;

public class Owner extends Person {
    private String nameclub;
    private String adrclub;
    Owner (String firstname, String lastname,String nameclup,String adrclub){
     super(firstname,lastname)      ;
     this.nameclub= nameclub;
     this.adrclub=adrclub;
    }
  public void displaysOwner(){
      super.displaysPerson();
      System.out.println("name of club is"+this.nameclub);
      System.out.println("adress is"+this.adrclub);
  }  
}
