package com.nseit.studentCourse.controller;

import com.nseit.studentCourse.model.StudentModel;
import com.nseit.studentCourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody StudentModel studentModel) {
        studentService.addStudent(studentModel);
    }

    @GetMapping("/all")
    public List<StudentModel> viewStudent() {
        return studentService.viewStudent();
    }

    @PutMapping("/{id}")
    public void updateStudent(int id) {
        studentService.updateStudent(2);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(int id) {
        studentService.deleteStudent(1);
    }

    @GetMapping("/{id}")
    public List<StudentModel> viewRegStudent(int id) {
        return studentService.viewRegStudent(1);

    }

    @GetMapping("/{studentId}/course/{courseId}")
    public void registerCourse(int studentId, int courseId) {
        studentService.registerCourse(studentId, courseId);
    }
}
