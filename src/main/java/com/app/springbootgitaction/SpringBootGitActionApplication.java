package com.app.springbootgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitActionApplication {
//
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to enamul CICD Github action !";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitActionApplication.class, args);
	}

}
