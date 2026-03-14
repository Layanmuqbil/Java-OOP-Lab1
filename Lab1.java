package com.mycompany.lab1;

public class Lab1 {

    public static void main(String[] args) {
        Person p1= new Person("layan","muqbil");
        p1.displaysPerson();
        Customer c1 = new Customer ("kadi","al",2020);
        c1.displaysCustomer();
        Owner o1 = new Owner("lolo","mu","cs342","cs");
        o1.displaysOwner();
        Date d1=new Date (11,12,2020);
        System.out.println(d1.toString());
        Film f1=new Film ("Batman","2020","1001",d1);
        f1.displayFilm();
        Organize o2 = new Organize(4);
        o2.add(f1);
        o2.searchesMovie("Batman");
        
    }
}
