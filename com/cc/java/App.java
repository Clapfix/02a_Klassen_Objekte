package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella","white",29);
        
        cat1.tellYourName();
        cat1.tellYourFurColor();
        cat1.tellYorAge();

        System.out.println("------------------");

        // Cat cat2 = new Cat();
        // cat2.name = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        // cat2.tellYourName();
        // cat2.tellYourFurColor();
        // cat2.tellYorAge();
    
    }

}

// Cat --> Referenztyp / reference type
        // cat --> Referenzvariable / reference variable
        // new Cat() --> Call des default-Konstruktors