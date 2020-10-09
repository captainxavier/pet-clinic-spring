package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.Pet;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
