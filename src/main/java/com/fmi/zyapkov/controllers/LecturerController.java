package com.fmi.zyapkov.controllers;

import com.fmi.zyapkov.models.Lecturer;
import com.fmi.zyapkov.services.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("lecturers")
public class LecturerController {

    @Autowired
    private LecturerService lecturerService;

    /**
     * @param id
     * @return lecturer by specific id
     */
    @GetMapping(value= "/{id}" , produces = "application/json")
    public Lecturer getById(@PathVariable Long id){
        return lecturerService.getById(id);
    }


    /**
     * @return list of lecturers
     */
    @GetMapping(produces = "application/json")
    public List<Lecturer> getAll(){
        return lecturerService.getAll();
    }

    /**
     * @param lecturer
     * @return create new lecturer
     */
    @PostMapping
    public Lecturer createLecturer(@RequestBody @Valid Lecturer lecturer){
        return lecturerService.create(lecturer);
    }

    /**
     * @param id
     *
     * This method delete lecturer by id if such exists
     */
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        lecturerService.deleteById(id);
    }

    /**
     * This method delete all lecturers in database
     */
    @DeleteMapping
    public void deleteAll(){
        lecturerService.deleteAll();
    }
}
