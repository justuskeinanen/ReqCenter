package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Card;
import com.example.demo.domain.CardRepository;

@SpringBootApplication
public class ReqCenterApplication {
	@Autowired
	private CardRepository cardRepo;

	public static void main(String[] args) {
		SpringApplication.run(ReqCenterApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Card card1 = new Card("Snowcard");
			card1.setScenario("new tenant");
			cardRepo.save(card1);

		};
	}

}
