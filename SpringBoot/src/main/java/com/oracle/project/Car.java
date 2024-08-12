package com.oracle.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("petrol")
	Running running; 
	
	public Car() {
		System.out.println("Car ctor..."+this+" with running : "+running);
	}
	void drive() {
		System.out.println("Car is using "+running+ " engine ");
	}
}
