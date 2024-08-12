package com.oracle.project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
interface Running {
	public void run();
}

@Component("genericEngine")
public class Engine implements Running {
	public Engine() {
		System.out.println("Engine ctor..."+this);
	}
	public void run() {
		System.out.println("Engine is running....");
	}
}

@Component("petrol")
class PetrolEngine extends Engine
{

	public PetrolEngine() {
		System.out.println("PetrolEngine() ctor...");
		System.out.println("-----------------");

	}
	
}

@Component("diesel")
class DieselEngine extends Engine
{
	public DieselEngine() {
		System.out.println("DieselEngine() ctor...");
		System.out.println("-----------------");

	}
}

@Component("cng")
class CNGEngine extends Engine 
{
	public CNGEngine() {
		System.out.println("CNGEngine() ctor...");
		System.out.println("-----------------");

	}
}

@Component("hybrid")
class HybridEngine extends Engine
{
	public HybridEngine() {
		System.out.println("HybridEngine() ctor...");
		System.out.println("-----------------");
	}
}

@Component("electric")
class ElectricEngine extends Engine
{
	public ElectricEngine() {
		System.out.println("ElectricEngine() ctor...");
		System.out.println("-----------------");

	}
}