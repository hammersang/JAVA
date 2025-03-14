package kr.ac.ync.computer.ync;

import java.util.ArrayList;

public class Student {
    private String id;
    private  String name;
    private ArrayList<Grade> grades;
    public Student(String id){
         this(id, "");
    }
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
