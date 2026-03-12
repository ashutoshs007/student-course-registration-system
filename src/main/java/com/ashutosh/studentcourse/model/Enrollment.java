package com.ashutosh.studentcourse.model;

import jakarta.persistence.*;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer studentId;

    private Integer courseId;

    public Enrollment() {
    }

    public Enrollment(Integer id, Integer studentId, Integer courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}