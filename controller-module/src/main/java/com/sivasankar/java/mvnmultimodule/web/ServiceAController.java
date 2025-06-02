package com.sivasankar.java.mvnmultimodule.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ServiceAController {

	@GetMapping("/greet")
	public String greet() {
		return " from Service A!";
	}
}