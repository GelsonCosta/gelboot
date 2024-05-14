package com.gelsoncosta.gelboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Teste de SpringBoot";
	}

}