package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        /** Typkonvertierung  */
        // output(String.valueOf(2));  // int --> String
        // output(Integer.toString(2)); // int --> String
        // output("Das ist eine Ziffer: " + 2); // int --> String

        Cat cat1 = new Cat("Grizabella", "white", 29);
        output("Name: " + cat1.getName());
        output("Fellfarbe " + cat1.getFurColor());
        output("Alter: " + cat1.getAge());

        output("-------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        cat2.setName("Rumple Teaser");

        output("Name: " + cat2.getName());
        output("Fellfarbe " + cat2.getFurColor());
        output("Alter: " + cat2.getAge());
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
