package com.fmi.zyapkov.controllers;

import com.fmi.zyapkov.models.University;
import com.fmi.zyapkov.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("universities")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping(produces = "application/json")
    public List<University> getAll(){
        return universityService.getAll();
    }
}
