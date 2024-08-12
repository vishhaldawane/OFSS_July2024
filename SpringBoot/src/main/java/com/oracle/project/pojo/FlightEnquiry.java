package com.oracle.project.pojo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

//plain old java object - entity 

@Component
public class FlightEnquiry {

	public FlightEnquiry() {
		System.out.println("FlightEnquiry() ctor...");
	}
	public void showAvailableFlights(String src, String trg, LocalDate dateOfJourney)
	{
		System.out.println("Searching flights ...from "+src+" to "+trg+" on "+dateOfJourney);
	}
}
