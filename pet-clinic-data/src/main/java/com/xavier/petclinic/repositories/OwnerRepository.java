package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.Owner;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);

}
