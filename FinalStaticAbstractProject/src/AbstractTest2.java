
public class AbstractTest2 {
	public static void main(String[] args) {
		
		Directing x = new Director();
		
		x.react();
		x.respond();
		x.proact();
		x.execute();
		x.manage();
		x.direct();
		
	}
}

interface Reactive {
	void react();
}
interface Responsive {
	void respond();
}
interface Proactive {
	void proact();
}
interface Executing {
	void execute();
}
interface Managing {
	void manage();
}
interface Directing {
	void direct();
}
class Human { }
class Person extends Human implements Reactive
{
	public void react() {
		System.out.println("Person is reacting....");
	}
}
class Student extends Person implements Responsive
{
	public void respond() {
		System.out.println("Student is responding....");
	}
}
class Employee extends Student implements Proactive
{
	public void proact() {
		System.out.println("Employee is proacting....");
	}
}
class Executive extends Employee implements Executing 
{
	public void execute() {
		System.out.println("Executive is executing....");
	}
}
class Manager extends Executive implements Managing
{
	public void manage() {
		System.out.println("Manager is managing....");
	}
}
class Director extends Manager implements Directing 
{
	public void direct() {
		System.out.println("Director is directing....");
	}
}













/*
				  Light
					|
		-------------------------
		|			|			|
	SunLight	MoonLight	CandleLight	

What is interface?
	interface is a pure "partial contract" of a class
	
	- it cannot have function with body
		(except default )
	- multiple level inheritance is possible
		
interface Instrument // abstract class Intrument { }
{
   void use();
}
							Instrument <-- interface
								| use();
				---------------------------------
				|								|
	MusicalInstrument						MedicalInstrument
	 | play();										| operate();
----------------------						----------------------
|					|						|					|
StringBased			AirBased			Surgical		  Pathological
MusicalInstrument	MusicalInstrument	MedicalInstrument MedicalInstrument
| tuneStrings();	|blowAir();				|sterilize();		|count();
------------		-----------------	---------------		-------------
|		|			|			|		|		|			|		|
Guitar	Violin		Flute	MouthOrgan	Cutter Needle	 Glucometer ECGMachine
|pluck()  |bow()	tune	  slide();	 cut(); poke();  countSugar()  detectPulse();
|		  Cello		Holes();
|
ElectronicGuitar








*/