package peter.springpetclinic.peterpetclinic.services.map;

import peter.springpetclinic.peterpetclinic.model.Pet;
import peter.springpetclinic.peterpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    // This is the save from CrudService
    @Override
    public Pet save(Pet object) {
        // Here we are using the save from the AbstractMapService
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
