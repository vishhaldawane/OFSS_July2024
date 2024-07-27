/*

	Human	Reactive
		|	|
		Person	Responsive
			|	  |
			Student	Proactive
				|	   |
				Employee  Executing
					|		|
					Executive  Managing
						|	    
					   Manager Directing
						|	   |
						Director
						
						
		Human	Reactive
		|	|		|
		Person	Responsive
			|	  |	    |
			Student	Proactive
				|	   |   |
				Employee  Executing
					|		|    |
					Executive  Managing
						|	      |
					   Manager Directing
						|	   |
						Director


*/
public class AbstractTest2 {
	public static void main(String[] args) {
		//object slicing 
		
		Director  directorObj = new Director();
		Seminar.meetings(directorObj);
		
		Reactive  react = directorObj;
		react.react();
		//react.direct();
		
	}
}
class Seminar
{
	static void meetings(Managing x) {
		System.out.println("Meeting for ");
		x.direct();
		x.manage();
		x.execute();
		x.proact();
		x.respond();
		x.react();
	}
}



interface Reactive {
	void react();
}
interface Responsive extends Reactive {
	void respond();
}
interface Proactive extends Responsive {
	void proact();
}
interface Executing extends Proactive {
	void execute();
}
interface Managing extends Executing {
	void manage();
}
interface Directing extends Managing {
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