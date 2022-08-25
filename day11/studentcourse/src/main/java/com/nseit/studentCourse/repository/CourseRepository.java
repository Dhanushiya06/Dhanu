package com.nseit.studentCourse.repository;

import com.nseit.studentCourse.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel,Integer> {
}
