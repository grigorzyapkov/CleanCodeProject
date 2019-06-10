package com.fmi.zyapkov.services;

import com.fmi.zyapkov.exceptions.EntityNotFoundException;
import com.fmi.zyapkov.models.Course;
import com.fmi.zyapkov.models.Student;
import com.fmi.zyapkov.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {

        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);

        return students;
    }

    public Student getById(Long id) {
        throwExceptionIfStudentNotExists(id);
        return studentRepository.findById(id).get();
    }

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Student incrementStudentGradeByOne(Long id) {

        throwExceptionIfStudentNotExists(id);

        Student student = studentRepository.findById(id).get();
        student.incrementGrade();

        return studentRepository.save(student);
    }

    public Student addCompletedCourse(Long id, Course course) {

        throwExceptionIfStudentNotExists(id);

        Student student = studentRepository.findById(id).get();
        student.addCompletedCourse(course);

        return studentRepository.save(student);
    }

    public void deleteById(Long id){
        throwExceptionIfStudentNotExists(id);
        studentRepository.deleteById(id);
    }

    public void deleteAll(){
        studentRepository.deleteAll();
    }

    private void throwExceptionIfStudentNotExists(Long id){
        if(!isExists(id)){
            throw new EntityNotFoundException(String.format("Student with id=%s does not exists!", id));
        }
    }

    private boolean isExists(Long id){
        return studentRepository.existsById(id);
    }
}
