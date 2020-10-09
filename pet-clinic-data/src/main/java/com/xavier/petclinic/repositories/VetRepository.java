package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.Vet;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
