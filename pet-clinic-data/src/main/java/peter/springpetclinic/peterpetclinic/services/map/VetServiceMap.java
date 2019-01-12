package peter.springpetclinic.peterpetclinic.services.map;

import peter.springpetclinic.peterpetclinic.model.Vet;
import peter.springpetclinic.peterpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    // This is the save from CrudService
    @Override
    public Vet save(Vet object) {
        // Here we are using the save from the AbstractMapService
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
