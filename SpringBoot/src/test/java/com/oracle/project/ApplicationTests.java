package com.oracle.project;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.project.pojo.FlightEnquiry;

@SpringBootTest
class ApplicationTests {

	@Autowired
	Car theCar1;



	@Test
	void contextLoads() {
		System.out.println("--> test case1 started...");
		theCar1.drive();
		System.out.println("--> test case2 finished...");

	}

}
