package com.ashutosh.studentcourse.service;

import com.ashutosh.studentcourse.model.Course;
import com.ashutosh.studentcourse.model.Enrollment;
import com.ashutosh.studentcourse.model.Student;
import com.ashutosh.studentcourse.repository.CourseRepository;
import com.ashutosh.studentcourse.repository.EnrollmentRepository;
import com.ashutosh.studentcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentCourseService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;


    // Create Student
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }


    // Create Course
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }


    // Enroll student in course
    public String enrollStudent(Integer studentId, Integer courseId){

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentId(studentId);
        enrollment.setCourseId(courseId);

        enrollmentRepository.save(enrollment);

        return "Student enrolled successfully";
    }


    // Get all courses of a student
    public List<Integer> getCoursesOfStudent(Integer studentId){

        List<Enrollment> enrollments = enrollmentRepository.findByStudentId(studentId);

        return enrollments.stream()
                .map(Enrollment::getCourseId)
                .collect(Collectors.toList());
    }


    // Unenroll student
    public String unenrollStudent(Integer studentId, Integer courseId){

        enrollmentRepository.deleteAll(
                enrollmentRepository.findByStudentId(studentId)
                        .stream()
                        .filter(e -> e.getCourseId().equals(courseId))
                        .toList()
        );

        return "Student unenrolled successfully";
    }

}