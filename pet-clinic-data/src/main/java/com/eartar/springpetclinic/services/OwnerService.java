package com.eartar.springpetclinic.services;

import com.eartar.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
