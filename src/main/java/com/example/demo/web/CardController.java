package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.CardRepository;

@Controller
public class CardController {
@Autowired
private CardRepository cardRepo;
	@GetMapping("/snowcard")
	public String snowcard(Model model) {
		model.addAttribute("cards", cardRepo.findAll());
		return "snowcard";
	}
}
