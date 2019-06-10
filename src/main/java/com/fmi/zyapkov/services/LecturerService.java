package com.fmi.zyapkov.services;

import com.fmi.zyapkov.exceptions.EntityNotFoundException;
import com.fmi.zyapkov.models.Lecturer;
import com.fmi.zyapkov.repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    public List<Lecturer> getAll() {

        List<Lecturer> lecturers = new ArrayList<>();
        lecturerRepository.findAll().forEach(lecturers::add);

        return lecturers;
    }

    public Lecturer getById(Long id) {
        if(!isExists(id)){
            throw new EntityNotFoundException(String.format("Lecturer with id=%s does not exists!", id));
        }

        return lecturerRepository.findById(id).get();
    }

    public Lecturer create(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    public void deleteById(Long id){
        if(!isExists(id)){
            throw new EntityNotFoundException(String.format("Lecturer with id=%s does not exists!", id));
        }

        lecturerRepository.deleteById(id);
    }

    public void deleteAll(){
        lecturerRepository.deleteAll();
    }

    private boolean isExists(Long id){
        return lecturerRepository.existsById(id);
    }
}
