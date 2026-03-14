package com.mycompany.lab1;

public class Film {
    private String title;
    private String genre;
    private String identifier;
    private Date datetrans;
 Film (String title , String genre, String identifier ,Date datetrans){
        this.title=title;
        this.genre=genre;
        this.identifier=identifier;
        this.datetrans=datetrans;
    }
 public String getTitle(){
     return this.title;
 }
 public void displayFilm (){
  System.out.println("title is"+this.title);
  System.out.println("genre is"+this.genre);
  System.out.println("identifire is"+this.identifier);
  System.out.println("date is"+this.datetrans);
 }
 
}
