package com.Caretackers.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Caretackers.Repository.PatientMedicineRepository;
import com.Caretackers.model.PatientMedicine;

@Controller
public class PatientMedicineController {

	@Autowired
	PatientMedicineRepository patientmedicineRepo;
	
	@RequestMapping(value = "addmedicine", method = RequestMethod.POST)
	public ModelAndView medicine(@RequestBody @Valid  PatientMedicine patientmedicine, Map<Integer, Object> map)  {
		ModelAndView model = new ModelAndView();
		patientmedicineRepo.save(patientmedicine);
		return model;
}
}
