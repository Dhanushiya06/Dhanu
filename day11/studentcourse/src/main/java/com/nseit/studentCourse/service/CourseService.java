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
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(CourseModel courseModel) {
        courseRepository.save(courseModel);
    }

    public List<CourseModel> viewCourse() {
        return courseRepository.findAll();
    }

    public void updateCourse(int id) {
        for (CourseModel courseModel : courseRepository.findAll()) {
            if (id == courseModel.getCourse_id()) {
                courseRepository.save(courseModel);
            }
        }
    }

    public void deleteCourse(int id) {
        CourseModel courseModel = courseRepository.findById(id).get();
        courseRepository.delete(courseModel);
    }

    public List<CourseModel> viewRegCourse(int id) {
        return courseRepository.findAll();
    }

    public void registerStudent(int courseId, int studentId) {
        StudentModel studentModel = studentRepository.findById(studentId).get();
        CourseModel courseModel = courseRepository.findById(courseId).get();
        List<StudentModel> studentModelList = courseModel.getStudent();
        studentModelList.add(studentModel);
        courseModel.setStudent(studentModelList);
        courseRepository.save(courseModel);
    }
}

