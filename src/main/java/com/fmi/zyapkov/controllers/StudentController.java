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

    /**
     * @param id
     * @return student by id
     */
    @GetMapping(value= "/{id}" , produces = "application/json")
    public Student getById(@PathVariable Long id){
        return studentService.getById(id);
    }

    /**
     * @return list of students
     */
    @GetMapping(produces = "application/json")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    /**
     * @param student
     * @return create new student
     */
    @PostMapping
    public Student createStudent(@RequestBody @Valid Student student){
        return studentService.create(student);
    }

    /**
     * This endpoint increment student's grade with one
     * @param id
     * @return updated student
     */
    @PostMapping("/{id}/increment-grade")
    public Student incrementStudentGradeByOne(@PathVariable Long id){
       return studentService.incrementStudentGradeByOne(id);
    }

    /**
     * This method add new completed course for student with specific id
     * @param id
     * @param course
     * @return updated student
     */
    @PostMapping("/{id}/add-course")
    public Student addCompletedCourse(@PathVariable Long id, @RequestBody Course course){
        return studentService.addCompletedCourse(id, course);
    }

    /**
     * This method delete student with specific id
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }

    /**
     * This method delete all students in database
     */
    @DeleteMapping
    public void deleteAll(){
        studentService.deleteAll();
    }
}
