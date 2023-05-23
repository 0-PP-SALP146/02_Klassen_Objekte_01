package com.cc.java;

public class App {
    
   public static void main(String[] args) {

     /* Instanziierung (Objekt) Klasse --> Objekt */    
     Cat cat1 = new Cat("Grizabella", "white", 29);

     // Ausgabe über Methoden
     output(cat1.getName());
     output(cat1.getFurColor());
     output(Integer.toString(cat1.getAge())); // Typkonvertierung

     output("--------------------");
    
     Cat cat2 = new Cat("Alonzo", "grey", 35);

     cat2.setFurColor("black"); // setzen die Farbe black statt der ursprünglichen Farbe

     // Ausgabe direkt
     output(cat2.getName());
     output(cat2.getFurColor());
     output(Integer.toString(cat2.getAge())); // Typkonvertierung

   } 

   public static void output(String outStr) {
        System.out.println(outStr); 
   }



}

