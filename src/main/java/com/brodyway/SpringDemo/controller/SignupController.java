package com.brodyway.SpringDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brodyway.SpringDemo.model.User;
import com.brodyway.SpringDemo.repositry.UserRepositry;

@Controller
public class SignupController {

	@Autowired
	private UserRepositry userRepo;

	@GetMapping("/Signup")
	public String getSingnup() {
		return "Signup";

	}

	@PostMapping("/Signup")
	public String postsignup(@ModelAttribute User u2, Model model) {

//		model.addAttribute("email", u2.getEmail());
//		model.addAttribute("psw", u2.getPsw());
//		model.addAttribute("psw_repeat", u2.getPsw_repeat());

		userRepo.save(u2);

		return "LoginForm";

	}

}
