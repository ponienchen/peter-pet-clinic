package peter.springpetclinic.peterpetclinic.services;

import peter.springpetclinic.peterpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
