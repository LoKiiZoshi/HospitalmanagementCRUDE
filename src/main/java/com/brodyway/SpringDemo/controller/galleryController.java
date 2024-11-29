package com.brodyway.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class galleryController {

	@GetMapping("/gallery")
	public String getgallery() {
		return "Gallery";
	}

}
