package com.eartar.springpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass //this wont be in database, other classes will inherit it
public class BaseEntity implements Serializable {

    //boxed types are always better since they can be nulled
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity -> simple auto incremented
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
