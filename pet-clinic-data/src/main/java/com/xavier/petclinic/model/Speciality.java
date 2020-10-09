package com.xavier.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public Speciality() {
    }

    public Speciality(String description) {
        this.description = description;
    }

}
