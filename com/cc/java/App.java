package com.cc.java;

public class App {
    
   public static void main(String[] args) {

     /* Instanziierung (Objekt) Klasse --> Objekt */
     // Cat -- Referenztyp
     // cat -- Referenzvariable
         
     Cat cat1 = new Cat("Grizabella", "white", 29);

     // Wertzuweisung
     // cat1.name = "Grizabella";
     // cat1.furColor = "white";
     // cat1.age = 29;

     // Ausgabe über Methoden
     output(cat1.tellYourName());
     output(cat1.tellYourFurColor());
     output(Integer.toString(cat1.tellYourAge())); // Typkonvertierung


     // App.output("hi");
     output("--------------------");
    
     Cat cat2 = new Cat("Alonzo", "grey", 35);

     // Wertzuweisung
     cat2.name = "Alonzo";
     cat2.furColor = "grey";
     cat2.age = 35;

     // Ausgabe direkt
     output(cat2.name);
     output(cat2.furColor);
     output(Integer.toString(cat2.age)); // Typkonvertierung

   } 



   public static void output(String outStr) {
        System.out.println(outStr); 
   }



}

