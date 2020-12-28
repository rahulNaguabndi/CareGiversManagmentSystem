package com.Caretackers.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Caretackers.model.PatientMedicine;

public interface PatientMedicineRepository extends CrudRepository<PatientMedicine, Integer> {

}
