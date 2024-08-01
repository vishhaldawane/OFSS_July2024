package dao;

interface Playable {
	void play(int time);
}

class Employee
{
	int empno;
	void calcSalary() { 
		System.out.println("PARENT calcSalary");

	}
}
class Executive extends Employee //separate class file
{
	int hra;
	void calcSalary() { 
		System.out.println("EXECUTIV calcSalary");

	}
	
}

/*
				Employee
					|
			--------------------------
			|				|		|
		Executive			Test$1  Test$2
*/
public class Test {

	
	public static void main(String[] args) {
	
		Employee e1 = new Executive();
		e1.calcSalary();
		
		Employee e2 = new Employee()
		{ //begin  a class
					void calcSalary() {
						System.out.println("CHILD1 calcSalary");
					}
					void calcHra() { }
					
		}; //end of a class
		
		Employee e3 = new Employee()
		{ //begin  a class
					void calcSalary() {
						System.out.println("CHILD2 calcSalary");
					}
					void calcHra() { }
					
		}; //end of a class
		
		new Employee()
		{ //begin  a class
					void calcSalary() {
						System.out.println("CHILD3 calcSalary");
					}
					void calcHra() { }
					
		}.calcSalary();
		
		e2.calcSalary();
		e3.calcSalary();
		
		//e2.calcHra();
		
		
		Playable playable = new Player();
		playable.play(50);
		
		playable = new Game();
		playable.play(30);
		
		// (arguments) -> BODY OF THE FUNCTION
		playable = (int x) -> { 
			System.out.println("Playing a game for "+x+"mnts");	
		};
		
		playable = (int x) -> System.out.println("Playing a cricket for "+x+"mnts");
		playable = (int x) -> System.out.println("Playing a football for "+x+"mnts");
		playable = (int x) -> System.out.println("Playing a hockey for "+x+"mnts");
		playable = (int x) -> System.out.println("Playing a volleyball for "+x+"mnts");

	}
}

class Player implements Playable
{
	public void play(int time) {
		System.out.println("Player is playing for "+time+" mnts");
	}
}

class Game implements Playable
{
	public void play(int time) {
		System.out.println("Game is playing for "+time+" mnts");
	}
}







/*

Playable player = (int t) -> { 
System.out.println("Playing for "+t+" time");
};
player.play(50);
player.play(60);
player.play(70);



*/


