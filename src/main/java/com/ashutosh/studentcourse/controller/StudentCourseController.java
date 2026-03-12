package com.ashutosh.studentcourse.controller;

import com.ashutosh.studentcourse.model.Course;
import com.ashutosh.studentcourse.model.Student;
import com.ashutosh.studentcourse.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    // API to Create Student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentCourseService.addStudent(student);
    }

    // API to Create Course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return studentCourseService.addCourse(course);
    }

    //API to Enroll student
    @PostMapping("/enroll/{studentId}/{courseId}")
    public String enrollStudent(@PathVariable Integer studentId,
                                @PathVariable Integer courseId){

        return studentCourseService.enrollStudent(studentId,courseId);
    }

    // Get courses of student
    @GetMapping("/students/{id}/courses")
    public List<Integer> getCourses(@PathVariable Integer id){
        return studentCourseService.getCoursesOfStudent(id);
    }

    // Unenroll student
    @DeleteMapping("/enroll/{studentId}/{courseId}")
    public String unenroll(@PathVariable Integer studentId,
                           @PathVariable Integer courseId){

        return studentCourseService.unenrollStudent(studentId,courseId);
    }
}