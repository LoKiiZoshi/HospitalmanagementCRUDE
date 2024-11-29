package com.brodyway.SpringDemo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brodyway.SpringDemo.model.Patient;

import com.brodyway.SpringDemo.repositry.PatientRepositry;


@Controller
public class PatientController {
	
	@Autowired
	private PatientRepositry PatientRepo;
	
	@GetMapping("/Patient")
	public String getPatient() {
		return ("Patient");

	}

	@PostMapping("/Patient")
	public String postPatient(@ModelAttribute Patient p, Model model) {
		model.addAttribute("name", p.getName());
		model.addAttribute("gender", p.getGender());
		model.addAttribute("phone", p.getPhone());
		model.addAttribute("dob", p.getDob());
		model.addAttribute("marial_Status", p.getMarial_Status());
		model.addAttribute("present_address", p.getPresent_address());
		model.addAttribute("communication_address",p.getCommunication_address());
		model.addAttribute("past_medical_history", p.getPast_medical_history());
		model.addAttribute("other_details", p.getOther_details());

		PatientRepo.save(p);
		return "PatientProfile";

	}

}
