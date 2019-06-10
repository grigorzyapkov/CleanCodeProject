package com.fmi.zyapkov.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String name;

    protected University() {

    }

    public University(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
