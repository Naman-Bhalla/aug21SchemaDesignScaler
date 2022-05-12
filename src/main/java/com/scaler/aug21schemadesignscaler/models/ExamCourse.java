package com.scaler.aug21schemadesignscaler.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class ExamCourse extends BaseModel {
    //  EC : Exam
    //   1  : 1
    //   M   :  1
    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Course course;
    private Date date;

}
