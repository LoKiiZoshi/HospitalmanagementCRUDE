package com.brodyway.SpringDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brodyway.SpringDemo.model.Appointment;
import com.brodyway.SpringDemo.repositry.AppointmentRepositry;

@Controller
public class AppointmentController {
	
	@Autowired
	private AppointmentRepositry appointmentRepo;

	@GetMapping("/Appointment")
	public String getAppointment() {
		return ("Appointment");

	}

	@PostMapping("/Appointment")
	public String postAppointment(@ModelAttribute Appointment A, Model model) {
		model.addAttribute("doctor", A.getDoctor());
		model.addAttribute("date", A.getDate());
		model.addAttribute("no_of_slots", A.getNo_of_slots());
		model.addAttribute("details", A.getDetails());
		model.addAttribute("consultation_fee", A.getConsultation_fee());

		appointmentRepo.save(A);
		return ("AppointmentProfile");

	}
}
