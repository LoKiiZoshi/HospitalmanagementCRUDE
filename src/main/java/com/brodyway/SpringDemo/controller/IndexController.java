package com.brodyway.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/") // call this method at project start

	public String getIndex() {

		return "index";
	}

}
