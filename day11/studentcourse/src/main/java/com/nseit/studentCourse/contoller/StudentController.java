package com.nseit.studentCourse.contoller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @PostMapping
    public void addService() {

    }

    @GetMapping("/all")
    public void viewService() {

    }

    @PutMapping()
    public void updateService() {

    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable int id) {

    }
}
