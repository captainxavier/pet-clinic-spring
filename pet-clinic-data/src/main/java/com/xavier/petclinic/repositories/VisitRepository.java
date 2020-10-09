package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.Visit;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
