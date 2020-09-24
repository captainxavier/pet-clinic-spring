package com.xavier.petclinic.services;

import com.xavier.petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices extends CrudServices<OwnerServices, Long> {

    Owner finfByLastName(String lastName);


}
