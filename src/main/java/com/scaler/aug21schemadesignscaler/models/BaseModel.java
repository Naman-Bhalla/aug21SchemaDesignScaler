package com.scaler.aug21schemadesignscaler.models;

// Audit
// Base

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    // ID
    // CreatedAt
    // CreatedBy
    // LastModifiedDate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;
}


// class A {
//   private int a;
//   private String b;
//   public int c;
// }
// class B extends A {
//
// }
//
//  B b = new B();