package com.eartar.springpetclinic.services;

import com.eartar.springpetclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {
    T findByID(ID id);
    T save(T object);
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
