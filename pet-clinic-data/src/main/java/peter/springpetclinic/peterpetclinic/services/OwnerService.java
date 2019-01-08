package peter.springpetclinic.peterpetclinic.services;

import peter.springpetclinic.peterpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
