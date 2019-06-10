package com.fmi.zyapkov.controllers;

import com.fmi.zyapkov.models.Course;
import com.fmi.zyapkov.models.Student;
import com.fmi.zyapkov.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value= "/{id}" , produces = "application/json")
    public Student getById(@PathVariable Long id){
        return studentService.getById(id);
    }

    @GetMapping(produces = "application/json")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody @Valid Student student){
        return studentService.create(student);
    }

    @PostMapping("/{id}/increment-grade")
    public Student incrementStudentGradeByOne(@PathVariable Long id){
       return studentService.incrementStudentGradeByOne(id);
    }

    @PostMapping("/{id}/add-course")
    public Student addCompletedCourse(@PathVariable Long id, @RequestBody Course course){
        return studentService.addCompletedCourse(id, course);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        studentService.deleteAll();
    }
}
