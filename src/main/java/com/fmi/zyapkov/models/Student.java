package com.fmi.zyapkov.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int grade;
    private int facultyNumber;
    private List<Course> completedCourses;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.grade = 0;
        this.facultyNumber = 0;
        this.completedCourses = new ArrayList<>();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public List<Course> getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(List<Course> completedCourses) {
        this.completedCourses = completedCourses;
    }
}
