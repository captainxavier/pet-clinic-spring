package com.xavier.petclinic.services.map;

import com.xavier.petclinic.model.Pet;
import com.xavier.petclinic.services.CrudServices;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudServices<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}