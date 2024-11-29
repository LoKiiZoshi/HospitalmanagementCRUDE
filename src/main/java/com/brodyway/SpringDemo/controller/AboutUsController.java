package com.brodyway.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {
	@GetMapping("/AboutUs")
	public String getAboutUs() {

		return "AboutUs";

	}

}
