package com.eartar.springpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Column(name="adress")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner") //cascade delete if owner is deleted
    private final Set<Pet> pets = new HashSet<>();

    public Pet getPet(String name){
        return getPet(name, false);
    }

    public Pet getPet(String name, boolean ignoreNew){
        name = name.toLowerCase();
        for (Pet pet : pets){
            if (!ignoreNew || !pet.isNew()){
                if (pet.getName().equalsIgnoreCase(name)){
                    return pet;
                }
            }
        }
        return null;
    }

}
