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
public class LoginController {

	@Autowired
	private UserRepositry userRepo;

	@GetMapping("/login")
	public String getLogin() {
		return "LoginForm";
	}

	@PostMapping("/login")
	public String postLogin(@ModelAttribute User u, Model model) {
		User usr = userRepo.findByUsernameAndPassword(u.getUsername(), u.getPassword());

//	if (u.getUsername().equals("Lowckey") && u.getPassword().equals("777")) 

		if (usr != null) {

			model.addAttribute("uname", u.getUsername());
			model.addAttribute("password", u.getPassword());
			return "Home";

		}

		model.addAttribute("error", "user not found");
		return "LoginForm";

// profile

	}

}
