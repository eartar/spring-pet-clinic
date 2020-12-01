package com.eartar.springpetclinic.services.map;

import com.eartar.springpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "Simit";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findByID() {
        Owner owner = ownerMapService.findByID(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner savedOwner = ownerMapService.save(owner2);

        assertEquals(id,savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner2 = ownerMapService.save(Owner.builder().build());

        assertNotNull(owner2);
        assertNotNull(owner2.getId());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findByID(ownerId));//delete obj
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId); //delete id
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner simit = ownerMapService.findByLastName(lastName);

        assertNotNull(simit);
        assertEquals(ownerId, simit.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerMapService.findByLastName("cantbefound");

        assertNull(owner);
    }
}