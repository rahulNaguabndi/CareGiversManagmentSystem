package com.Caretackers.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Caretackers.Repository.PatientInfoRepo;
import com.Caretackers.model.PatientInfo;

@Controller
public class PatientInfoController {
	
	
	  @Autowired
	  PatientInfoRepo patientinfoRepo;
	  
	@RequestMapping(value = "addpatient", method = RequestMethod.POST) public
	  ModelAndView patientinfo(@RequestBody @Valid PatientInfo patientinfo,
	  Map<Integer, Object> map) { ModelAndView model = new
	  ModelAndView("redirect:/prevMedi.html");
	  this.patientinfoRepo.save(patientinfo); return model; }
	 
}
