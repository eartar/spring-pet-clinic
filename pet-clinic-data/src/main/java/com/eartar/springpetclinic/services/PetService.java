package com.eartar.springpetclinic.services;

import com.eartar.springpetclinic.model.Owner;
import com.eartar.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
