package com.example.weeklychallenge4;

public class Polymorphism  {
//Used as a screenshot on poly.html
    private String name;
    private String age;
    private String gender;
    public Polymorphism(){
    }
    public Polymorphism(String name, String gender) {
        this.name = name;
        this.age = gender;
    }
    public Polymorphism(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
