package com.ashutosh.studentcourse.repository;

import com.ashutosh.studentcourse.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    List<Enrollment> findByStudentId(Integer studentId);

    void deleteByStudentIdAndCourseId(Integer studentId, Integer courseId);

}