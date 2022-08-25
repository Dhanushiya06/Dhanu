package com.nseit.studentCourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")

public class StudentModel {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer rollNumber;
    private Integer age;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "studentModel_courseModel",
            joinColumns = @JoinColumn(name = "id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "courseModel_id",
                    referencedColumnName = "courseModel_id"))
    private List<CourseModel> courseModel;

}
