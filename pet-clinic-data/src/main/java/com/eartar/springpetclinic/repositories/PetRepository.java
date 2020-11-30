package com.eartar.springpetclinic.repositories;

import com.eartar.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<Pet, Long> {
}
