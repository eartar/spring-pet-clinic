package com.eartar.springpetclinic.services.map;

import com.eartar.springpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();


    private Long getNextId() {

        Long nextId = null;

        try {
            nextId =  Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }

        return nextId;
    }


    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    T save(T obj) {
        if (obj != null) {
            if (obj.getId() == null) {
                obj.setId(getNextId());
            }
            map.put(obj.getId(), obj);
        }
        else {
            throw new RuntimeException("obj can't be null");
        }
        return obj;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(obj));
    }

}
