package com.xavier.petclinic.services;


import com.xavier.petclinic.model.Owner;
import com.xavier.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();


}
