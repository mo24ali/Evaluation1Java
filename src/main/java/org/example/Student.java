package org.example;

public class Student {
    private String name;
    private int id;
    private int age, gpa;
    //constructor
    Student(String nm, int idd, int ag, int gp){
        name = nm;
        id = idd;
        age = ag;
        gp = gpa;
    }
    @Override
    public String toString(){
        return "the name of the student and his id  : " + name +" "+id + " his age is : " + age + " with total gps of : "+gpa;
    }
    public int getId(){
        return id;
    }
}
