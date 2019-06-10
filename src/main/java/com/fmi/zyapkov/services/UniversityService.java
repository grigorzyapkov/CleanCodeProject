package com.fmi.zyapkov.services;

import com.fmi.zyapkov.exceptions.EntityNotFoundException;
import com.fmi.zyapkov.models.University;
import com.fmi.zyapkov.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAll() {

        List<University> universities = new ArrayList<>();
        universityRepository.findAll().forEach(universities::add);

        return universities;
    }

    public University getById(Long id) {
        if(!isExists(id)){
            throw new EntityNotFoundException(String.format("University with id=%s does not exists!", id));
        }

        return universityRepository.findById(id).get();
    }

    public University create(University university) {
        return universityRepository.save(university);
    }

    public void deleteById(Long id){
        if(!isExists(id)){
            throw new EntityNotFoundException(String.format("University with id=%s does not exists!", id));
        }

        universityRepository.deleteById(id);
    }

    public void deleteAll(){
        universityRepository.deleteAll();
    }

    private boolean isExists(Long id){
        return universityRepository.existsById(id);
    }
}
