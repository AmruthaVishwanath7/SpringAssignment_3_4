package com.assignment.task3.SpringAssignment3_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private JavaLanguage lang;
	
	@Autowired
	public MyController(JavaLanguage lang) {
		super();
		this.lang = lang;
	}
	
	@GetMapping("hello")
	public String helloWorld() {
		return "HELLO WORLD!";
	}
	
	@GetMapping("/java")
	public String learningJava() {
		return lang.learningJava();
	}

}
