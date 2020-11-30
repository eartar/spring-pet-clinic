package com.eartar.springpetclinic.repositories;

import com.eartar.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository  extends CrudRepository<PetType, Long> {
}
