package com.mycompany.lab1;

public class Customer extends Person {
    private int numidentity;
    Customer(String firstname, String lastname,int numidentity){
        super(firstname,lastname);
        this.numidentity = numidentity;
        
    }
    public void displaysCustomer () {
         super.displaysPerson();
         System.out.println("identity card :"+this.numidentity);
         
         
    }
    }
