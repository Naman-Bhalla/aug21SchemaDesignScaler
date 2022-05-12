package com.scaler.aug21schemadesignscaler.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class StudentExamCourse extends BaseModel {
    // SEC : S
    //   1: 1
    //   m : 1
    //   m : 1
    @ManyToOne
    private Student student;

    // SEC : EC
    //  1  :  1
    // M   :  1
    @ManyToOne
    private ExamCourse examCourse;
    private int marks;
}
