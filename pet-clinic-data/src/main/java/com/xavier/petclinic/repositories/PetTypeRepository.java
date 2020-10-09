package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.PetType;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
