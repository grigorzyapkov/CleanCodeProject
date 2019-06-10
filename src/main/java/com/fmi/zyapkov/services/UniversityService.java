package com.fmi.zyapkov.services;

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

    public List<University> getAll(){

        List<University> universities = new ArrayList<>();
        universityRepository.findAll().forEach(universities::add);

        return universities;
    }
}
