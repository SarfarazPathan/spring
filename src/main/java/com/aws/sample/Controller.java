package com.aws.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
@RequestMapping("/")
public class Controller {

	@Value("${aws.db2.password}")
	private String password;
	
	@GetMapping("/getMsg")
	public String getMsg() {
		System.out.println("Property values : "+ password);
		return "Application is UP & RUNNING ...";
	}
	
	@GetMapping("/getMsg/{name}")
	public String getMsg(@PathVariable String name) {
		System.out.println("Property values : "+ password);
		return "Wel Come to world of Microservices ..."+ name;
	}
}
