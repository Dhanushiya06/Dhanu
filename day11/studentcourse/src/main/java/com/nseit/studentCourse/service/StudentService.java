package com.nseit.studentCourse.service;

import com.nseit.studentCourse.model.CourseModel;
import com.nseit.studentCourse.model.StudentModel;
import com.nseit.studentCourse.repository.CourseRepository;
import com.nseit.studentCourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public void addStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    public List<StudentModel> viewStudent() {
        return studentRepository.findAll();
    }

    public void updateStudent(int id) {
        for (StudentModel studentModel : studentRepository.findAll()) {
            if (id == studentModel.getId()) {
                studentRepository.save(studentModel);
            }
        }
    }

    public void deleteStudent(int id) {
        StudentModel studentModel = studentRepository.findById(id).get();
        studentRepository.delete(studentModel);
    }

    public List<StudentModel> viewRegStudent(int id) {
        return studentRepository.findAll();
    }

    public void registerCourse(int studentId, int courseId) {
        StudentModel studentModel = studentRepository.findById(studentId).get();
        CourseModel courseModel = courseRepository.findById(courseId).get();
        List<CourseModel> courseModelList = studentModel.getCourse();
        courseModelList.add(courseModel);
        studentModel.setCourse(courseModelList);
        studentRepository.save(studentModel);
    }
}


