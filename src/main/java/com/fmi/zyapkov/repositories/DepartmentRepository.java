package com.fmi.zyapkov.repositories;

import com.fmi.zyapkov.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
