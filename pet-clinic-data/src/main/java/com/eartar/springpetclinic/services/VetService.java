package com.eartar.springpetclinic.services;

import com.eartar.springpetclinic.model.Pet;
import com.eartar.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
