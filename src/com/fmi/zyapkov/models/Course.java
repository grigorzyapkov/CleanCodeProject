package com.fmi.zyapkov.models;

public class Course {

    private String name;
    private Lecturer lecturer;
    private int maxNumberOfStudents;
    private int credits;
    private Category category;

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
