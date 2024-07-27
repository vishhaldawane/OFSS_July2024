import java.util.Iterator;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin of main");
		Car car;
		try {
			car = new Car();
			car.startTheCar();

		} 
		catch(CarKeyNotFoundException e) {
			System.out.println("[ Key problem : ] "+e);	
		}
		catch(SpeedLimitExceededException e) {
			System.out.println("[ Speed problem : ] "+e);	
		}
		catch(TyrePuncturedException e) {
			System.out.println("[ Tyre problem : ] "+e);	
		}
		catch (Exception e) {
			System.out.println("[ Car problem : ] "+e);	
		}
		
		System.out.println("End of main");
	}
}
class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String str) {
		super(str);
	}
}
class  SpeedLimitExceededException extends Exception {
	SpeedLimitExceededException(String str) {
		super(str);
	}
}
class TyrePuncturedException extends RuntimeException { //unchecked
	TyrePuncturedException(String str) {
		super(str);
	}
}

class Car
{
	boolean keyFound=false;
	//if a ctor/method is throwing an exception
	// of type "checked" (24), then there 
	//is a mandate of throws clause(16)
	Car() throws CarKeyNotFoundException
	{
		double d = Math.random()%10;
		if(d>0.10) {
			keyFound=true;
			System.out.println("Car key found....");
		}
		else {
			throw new CarKeyNotFoundException("Car key not found");
		}
		
	
	}
	void startTheCar() throws SpeedLimitExceededException
	{
		System.out.println("Started the car...");
		run();
	}
	void run() throws SpeedLimitExceededException
	{
		for (int i = 1; i <=30; i++) {
			System.out.println("Driven "+i+" kms");
			double d = Math.random()%10;
			if(d>0.99) {
				throw new SpeedLimitExceededException("Speed limit exceeded");
			}
			else if(d>0.20 && d<0.30) {
				throw new TyrePuncturedException("Tyre punctured exception....");
			} 
		}
	}
	void stopTheCar() {
		System.out.println("Stopped the car...");
	}
	
}




