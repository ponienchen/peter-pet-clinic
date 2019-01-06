package peter.springpetclinic.peterpetclinic.services;

import peter.springpetclinic.peterpetclinic.model.Vet;

import java.util.Set;

public interface VerService {

    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
