package com.xavier.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;


}
