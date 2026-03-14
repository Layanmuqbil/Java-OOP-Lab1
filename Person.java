package com.mycompany.lab1;

public class Person {
    private String firstname ;
    private String lastname ;
    Person(String firstname,String lastname){
        this.firstname=firstname ;
        this.lastname=lastname ;
    }
public void displaysPerson (){
   System.out.println("Full name is :"+ this.firstname + this.lastname)   ;
}
}
