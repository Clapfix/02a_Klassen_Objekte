package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */

    public String getName() {
        if (getPermission()) {
           return this.name; 
        } else {
            return "Sorry, no permission!";
        }
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    /** Setter */

    public void setName(String name) {
        this.name = name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    private boolean getPermission(){
        return true;
    }


}