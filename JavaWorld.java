package com.assignment.task3.SpringAssignment3_4;

import org.springframework.stereotype.Component;

@Component
public class JavaWorld implements JavaLanguage {
	
	

	@Override
	public String learningJava() {
	
		return "I am learning java";
	}
	
}
