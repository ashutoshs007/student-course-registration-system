package com.ashutosh.studentcourse.repository;

import com.ashutosh.studentcourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}