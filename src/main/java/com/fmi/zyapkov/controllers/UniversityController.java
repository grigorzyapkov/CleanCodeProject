package com.fmi.zyapkov.controllers;

import com.fmi.zyapkov.models.University;
import com.fmi.zyapkov.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("universities")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    /**
     * @param id
     * @return university with specific id
     */
    @GetMapping(value= "/{id}" , produces = "application/json")
    public University getById(@PathVariable Long id){
        return universityService.getById(id);
    }

    /**
     * @return list of all universities
     */
    @GetMapping(produces = "application/json")
    public List<University> getAll(){
        return universityService.getAll();
    }

    /**
     * @param university
     * @return university that was created
     */
    @PostMapping
    public University createUniversity(@RequestBody @Valid University university){
        return universityService.create(university);
    }

    /**
     * This method delete university with specific id
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        universityService.deleteById(id);
    }

    /**
     * This method delete all universities in database
     */
    @DeleteMapping
    public void deleteAll(){
        universityService.deleteAll();
    }
}
