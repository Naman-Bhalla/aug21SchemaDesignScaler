package com.scaler.aug21schemadesignscaler.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends BaseModel {
    private String name;
    private String email;
    private String password;
    private String college;

//    @OneToMany(mappedBy = "courseMonitor")
//    private List<Course> monitorsOf;
}


// Husband {
//      Wife wife;
// }
// Wife {
//
// }

// PostgreSQL