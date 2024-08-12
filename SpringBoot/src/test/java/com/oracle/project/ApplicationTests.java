package com.oracle.project;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.project.layer2.IndianRailwayTicket;
import com.oracle.project.layer3.TicketRepository;
import com.oracle.project.pojo.FlightEnquiry;

@SpringBootTest
public class ApplicationTests {

	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	IndianRailwayTicket indRailTkt;

	@Test
	public void contextLoads() {
	
		indRailTkt.setTicketId(223);
		indRailTkt.setPassengerName("Sarah");
		indRailTkt.setSourceCity("Delhi");
		indRailTkt.setDestinationCity("Dubai");
		indRailTkt.setAge(22);
		indRailTkt.setTicketCost(45000);
		System.out.println("object filled up...");
		ticketRepository.save(indRailTkt);
		System.out.println("Object stored...");
	}

}
