/*
package com.eartar.springpetclinic.formatters;

import com.eartar.springpetclinic.model.PetType;
import com.eartar.springpetclinic.services.PetTypeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor
@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findAll();
        for (PetType type : findPetTypes) {
            if (type.getName().equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new ParseException("type not found:" + text, 0);
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }
}
*/
