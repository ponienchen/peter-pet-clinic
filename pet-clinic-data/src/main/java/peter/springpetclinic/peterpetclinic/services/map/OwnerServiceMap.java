package peter.springpetclinic.peterpetclinic.services.map;

import peter.springpetclinic.peterpetclinic.model.Owner;
import peter.springpetclinic.peterpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    // This is the save from CrudService
    @Override
    public Owner save(Owner object) {
        // Here we are using the save from the AbstractMapService
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
