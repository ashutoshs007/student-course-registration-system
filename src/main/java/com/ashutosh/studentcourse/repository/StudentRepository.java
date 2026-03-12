package com.ashutosh.studentcourse.repository;

import com.ashutosh.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}