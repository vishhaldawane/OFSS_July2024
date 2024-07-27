import java.util.Iterator;

public class ThreadTest {
	public static void main(String[] args) {
		Bike bike = new Bike();
		SedanCar car = new SedanCar();
		Train train = new Train();
		
		
		bike.start(); //invoke Thread's start()-> that invokes the run()
		car.start();
		train.start();
	}
}
class Bike extends Thread //1
{
	
	public void run() { //2
		for (int i = 0; i < 20; i++) {
			System.out.println("Bike is running..."+i);
		}
	}
}
class SedanCar extends Thread //1
{
	public void run() { //2
		for (int i = 0; i < 50; i++) {
			System.out.println("\tSedanCar is running..."+i);
		}
	}
}

class Train extends Thread //1
{
	public void run() { //2
		for (int i = 0; i < 250; i++) {
			System.out.println("\t\tTrain is running..."+i);
		}
	}
}





