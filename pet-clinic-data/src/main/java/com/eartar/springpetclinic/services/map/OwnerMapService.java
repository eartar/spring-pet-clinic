package com.eartar.springpetclinic.services.map;

import com.eartar.springpetclinic.model.Owner;
import com.eartar.springpetclinic.model.Pet;
import com.eartar.springpetclinic.services.OwnerService;
import com.eartar.springpetclinic.services.PetService;
import com.eartar.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        Owner savedOwner = null;

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getName() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType())); //set pettype as id
                        }
                    } else
                        throw new RuntimeException("Pet Type is required");

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else
            return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
