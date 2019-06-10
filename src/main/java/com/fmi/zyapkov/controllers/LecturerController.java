package com.fmi.zyapkov.controllers;

import com.fmi.zyapkov.models.Lecturer;
import com.fmi.zyapkov.services.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("lecturers")
public class LecturerController {

    @Autowired
    private LecturerService lecturerService;

    @GetMapping(value= "/{id}" , produces = "application/json")
    public Lecturer getById(@PathVariable Long id){
        return lecturerService.getById(id);
    }

    @GetMapping(produces = "application/json")
    public List<Lecturer> getAll(){
        return lecturerService.getAll();
    }

    @PostMapping
    public Lecturer createLecturer(@RequestBody @Valid Lecturer lecturer){
        return lecturerService.create(lecturer);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        lecturerService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        lecturerService.deleteAll();
    }
}
