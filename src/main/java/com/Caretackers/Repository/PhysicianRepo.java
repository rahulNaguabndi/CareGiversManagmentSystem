package com.Caretackers.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Caretackers.model.Physician;

public interface PhysicianRepo extends CrudRepository<Physician, Integer> {

}
