package com.Caretackers.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Caretackers.model.PatientInfo;

public interface PatientInfoRepo extends CrudRepository<PatientInfo, Integer>{

}
