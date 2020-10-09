package com.xavier.petclinic.services;

import com.xavier.petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices extends CrudServices<Owner, Long> {

   Owner findByLastName(String lastName);


}
