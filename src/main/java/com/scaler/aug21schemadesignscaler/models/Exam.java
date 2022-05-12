package com.scaler.aug21schemadesignscaler.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Exam extends BaseModel {
    private int duration;
}

// Break till 10:54 PM
// What if there are 2 relations to same entities.
// Assignment