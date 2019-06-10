package com.fmi.zyapkov.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lecturer extends Person{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    @OneToMany(mappedBy = "lecturer")
    private List<Course> courses;

    protected Lecturer(){
    }

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
