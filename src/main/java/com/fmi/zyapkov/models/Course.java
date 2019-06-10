package com.fmi.zyapkov.models;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Lecturer lecturer;

    @Column
    private int maxNumberOfStudents;

    @Column
    private int credits;

    @Column
    private Category category;

    protected Course(){

    }

    public Course(String name, Lecturer lecturer, int maxNumberOfStudents, int credits, Category category) {
        this.name = name;
        this.lecturer = lecturer;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.credits = credits;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
