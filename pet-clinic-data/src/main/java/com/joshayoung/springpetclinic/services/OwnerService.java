package com.joshayoung.springpetclinic.services;

import com.joshayoung.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
