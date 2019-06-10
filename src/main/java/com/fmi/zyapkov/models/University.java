package com.fmi.zyapkov.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Lecturer dean;

    @OneToMany(mappedBy = "id")
    private List<Department> departments;

    protected University(){

    }

    public University(String name, Lecturer dean, List<Department> departments) {
        this.name = name;
        this.dean = dean;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getDean() {
        return dean;
    }

    public void setDean(Lecturer dean) {
        this.dean = dean;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
