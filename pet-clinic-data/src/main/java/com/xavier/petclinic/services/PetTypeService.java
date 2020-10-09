package com.xavier.petclinic.services;

import com.xavier.petclinic.model.PetType;
import com.xavier.petclinic.services.CrudServices;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends CrudServices<PetType,Long> {
}
