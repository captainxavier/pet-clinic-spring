package com.xavier.petclinic.repositories;

import com.xavier.petclinic.model.Speciality;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
