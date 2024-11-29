package com.brodyway.SpringDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brodyway.SpringDemo.model.Specialization;
import com.brodyway.SpringDemo.repositry.SpecializationRepositry;

@Controller
public class SpecializationController {
	
	@Autowired
	private SpecializationRepositry specializationRepo;
	
	@GetMapping("/Specialization")
	public String getSpecialization() {
		return ("Specialization");

	}

	@PostMapping("/Specialization")
	public String postSpecialization(@ModelAttribute Specialization s, Model model) {
		model.addAttribute("code", s.getCode());
		model.addAttribute("name", s.getName());
		model.addAttribute("note", s.getNote());

		specializationRepo.save(s);
		return ("SpecializationProfile");

	}

}
