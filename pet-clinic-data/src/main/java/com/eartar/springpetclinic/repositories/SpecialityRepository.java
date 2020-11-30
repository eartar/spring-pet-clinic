package com.eartar.springpetclinic.repositories;

import com.eartar.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository  extends CrudRepository<Speciality, Long> {
}
