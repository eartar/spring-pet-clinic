package com.eartar.springpetclinic.repositories;

import com.eartar.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
