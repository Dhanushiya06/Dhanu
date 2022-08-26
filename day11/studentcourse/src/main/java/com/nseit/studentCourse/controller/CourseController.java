package com.nseit.studentCourse.controller;

import com.nseit.studentCourse.model.CourseModel;
import com.nseit.studentCourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody CourseModel courseModel) {
        courseService.addStudent(courseModel);
    }

    @GetMapping("/all")
    public List<CourseModel> viewCourse() {
        return courseService.viewCourse();
    }

    @PutMapping("/{id}")
    public void updateCourse(int id) {
        courseService.updateCourse(2);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(int id) {
        courseService.deleteCourse(1);
    }

    @GetMapping("/{courseId}/course/{studentId}")
    public void registerStudent( int courseId,int studentId) {
        courseService.registerStudent(courseId,studentId);

    }
}