package com.fmi.zyapkov.models;

import java.util.List;

public class University {

    private Person dean;
    private List<Department> departments;

    public Person getDean() {
        return dean;
    }

    public void setDean(Person dean) {
        this.dean = dean;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
