package com.scaler.aug21schemadesignscaler.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Course extends BaseModel {
    private String name;

    //   C : S
    //   1 : M
    //   M  : 1
    @ManyToMany
    private List<Student> liveStudents;

    @ManyToOne
    private Student courseMonitor;
    // C : monitor: S
    // 1     :      1
    // m     :      1

}
// mappedBy is only needed when I have the same relationship
// being represented from both the classes
