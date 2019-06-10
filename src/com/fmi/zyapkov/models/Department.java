package com.fmi.zyapkov.models;

import java.util.List;

public class Department {

    private String name;
    private Lecturer leader;
    private List<Lecturer> lecturers;

    public Department(String name, Lecturer leader, List<Lecturer> lecturers) {
        this.name = name;
        this.leader = leader;
        this.lecturers = lecturers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLeader() {
        return leader;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
