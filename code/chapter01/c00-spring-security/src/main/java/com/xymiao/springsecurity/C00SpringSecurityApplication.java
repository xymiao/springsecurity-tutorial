package com.xymiao.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class C00SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(C00SpringSecurityApplication.class, args);
	}


	@RestController
	class Index{
		@GetMapping("")
		public String index() {
			return "index";
		} 
	}

}
