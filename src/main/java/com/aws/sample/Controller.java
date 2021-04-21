package com.aws.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@GetMapping("/getMsg")
	public String getMsg() {
		return "Application is UP & RUNNING ...";
	}
	
	@GetMapping("/getMsg/{name}")
	public String getMsg(@PathVariable String name) {
		return "Wel Come to world of Microservices ..."+ name;
	}
}
