package com.fmi.zyapkov.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student extends Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    @Min(1)
    @Max(4)
    private int grade;

    @Column
    @Min(1)
    @Max(10000)
    private int facultyNumber;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> completedCourses;

    protected Student(){

    }

    public Student(String firstName, String lastName, int age, int grade, int facultyNumber) {
        super(firstName, lastName, age);
        this.grade = grade;
        this.facultyNumber = facultyNumber;
        this.completedCourses = new ArrayList<>();
    }

    public Long getId() {
        return id;
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

    public void addCompletedCourse(Course course){
        completedCourses.add(course);
    }

    public void incrementGrade(){
        grade++;
    }
}
