package com.fmi.zyapkov.repositories;

import com.fmi.zyapkov.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
