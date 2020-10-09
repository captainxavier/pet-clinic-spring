package com.xavier.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "owner")
public class Owner extends Person {

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pet = new HashSet<>();

    public Owner() {
    }

    public Owner(String address, String city, String telephone, Set<Pet> pet) {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pet = pet;
    }

}
