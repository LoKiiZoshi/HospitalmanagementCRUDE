package com.brodyway.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/HomeController")
	public String getHomeController() {
		return "Home";
	}

}
