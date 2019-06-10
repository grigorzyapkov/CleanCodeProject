package com.fmi.zyapkov.repositories;

import com.fmi.zyapkov.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
