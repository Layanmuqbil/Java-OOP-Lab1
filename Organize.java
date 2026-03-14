package com.mycompany.lab1;


public class Organize {
    private Film []tabfilm;
    private int nbfilm = 0;
    private int maxfilm;
    Organize(int maxfilm){
        this.maxfilm = maxfilm;
        this.tabfilm = new Film[this.maxfilm];
    }
    public void add (Film f) {
        if(this.nbfilm == this.maxfilm){
            System.out.println("Error its full");
        } else {
            this.tabfilm[this.nbfilm] = f;
            this.nbfilm++;
        }
    }
    public void displaysListFilm (){
        for(int i = 0; i < this.nbfilm; i++){
            this.tabfilm[i].displayFilm();
        }
    }
    public void searchesMovie (String title){
        boolean found = false;
        for(int i = 0; i < this.nbfilm; i++){
            if(this.tabfilm[i].getTitle().equalsIgnoreCase(title)){
                System.out.println("Film is found the ditails are:");
                this.tabfilm[i].displayFilm();
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Film is not found");
        }
                
    }
}
