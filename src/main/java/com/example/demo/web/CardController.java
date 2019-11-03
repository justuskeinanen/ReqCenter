package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
