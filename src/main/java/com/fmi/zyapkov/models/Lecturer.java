package com.fmi.zyapkov.models;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Lecturer extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Valid
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    protected Lecturer() {
    }

    public Lecturer(String firstName, String lastName, int age, List<Student> students) {
        super(firstName, lastName, age);
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
