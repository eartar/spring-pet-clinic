package com.eartar.springpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass //this wont be in database, other classes will inherit it
public class BaseEntity implements Serializable {

    //boxed types are always better since they can be nulled
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity -> simple auto incremented
    private Long id;

}
