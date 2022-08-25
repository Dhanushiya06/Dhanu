package com.nseit.studentCourse.contoller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @PostMapping
    public void addCourse() {

    }

    @GetMapping("/all")
    public void viewCourse() {

    }

    @PutMapping
    public void updateCourse() {

    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {

    }
}
