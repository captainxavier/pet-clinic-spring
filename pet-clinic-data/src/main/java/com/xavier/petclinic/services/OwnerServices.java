package com.xavier.petclinic.services;

import com.xavier.petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices {

    Owner finfByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
