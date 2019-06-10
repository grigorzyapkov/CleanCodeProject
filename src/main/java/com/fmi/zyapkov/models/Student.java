package com.fmi.zyapkov.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student extends Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int grade;
    private int facultyNumber;
    private List<Course> completedCourses;

    protected Student(){

    }

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
