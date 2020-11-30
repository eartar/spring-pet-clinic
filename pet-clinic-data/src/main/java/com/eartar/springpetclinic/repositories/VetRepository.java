package com.eartar.springpetclinic.repositories;

import com.eartar.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository  extends CrudRepository<Vet, Long> {
}
