package com.fmi.zyapkov.models;

import java.util.List;

public class Lecturer extends Person{

    private List<Course> courses;

    public Lecturer(String firstName, String lastName, int age, List<Course> courses) {
        super(firstName, lastName, age);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
