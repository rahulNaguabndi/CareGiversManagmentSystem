package com.Caretackers.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Caretackers.Repository.PhysicianRepo;
import com.Caretackers.model.Physician;


@Controller
public class PhysicianController {
	@Autowired
	PhysicianRepo physicianRepo;
	@RequestMapping(value = "addphysician", method = RequestMethod.POST)
	public ModelAndView physician(@RequestBody @Valid  Physician physician, Map<Integer, Object> map)  {
		ModelAndView model = new ModelAndView("redirect:/divide.html");
		physicianRepo.save(physician);
		return model;

	}
}
