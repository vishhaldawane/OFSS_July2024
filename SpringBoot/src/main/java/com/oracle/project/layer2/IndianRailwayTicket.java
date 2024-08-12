package com.oracle.project.layer2;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity // <-- there would be a table for it
//@Table(name="indianrailwayticket") // optional annotation
public class IndianRailwayTicket { //name of the table is same as the class
	
	@Id //mandatory annotation if the entity is declared with @Entity
	@Column(name="tktid") 
	private int ticketId; //ticket_id
	
	@Column(name="pname")
	private String passengerName; //passenger_name
	private int age; 
	private String sourceCity;
	private String destinationCity;
	private float ticketCost;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	
	
	
	
}
