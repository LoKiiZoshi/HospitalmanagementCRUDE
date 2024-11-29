package com.brodyway.SpringDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brodyway.SpringDemo.model.Doctor;
import com.brodyway.SpringDemo.repositry.DoctorRepositry;

@Controller
public class DoctorController {
	@Autowired
	private DoctorRepositry doctorRepo;
	
	@GetMapping("/Doctor")
	public String getDoctor() {

		return "Doctor";

	}

	@PostMapping("/Doctor")
	public String postDoctor(@ModelAttribute Doctor d, Model model) {
		
	    model.addAttribute("name", d.getName());
		model.addAttribute("emailid", d.getEmailid());
		model.addAttribute("specialization", d.getSpecialization());
		model.addAttribute("address", d.getAddress());
		model.addAttribute("mobile", d.getMobile());
		model.addAttribute("gender", d.getGender());
		model.addAttribute("note", d.getNote());
		
        doctorRepo.save(d);
		return ("DoctorProfile");
	}
}
