
public class ThreadSyncTest {
	public static void main(String[] args) {
		FoodItem food = new FoodItem();
		food.name="Pizza";
		
		Server server = new Server(food);
		Eater  eater  = new Eater(food);
		
		server.start();
		eater.start();
		
		
	}
}
class FoodItem
{
	String name;
	boolean isServed; //false
	
	public synchronized void eat() { //Eater thread
		if(isServed==false) {
			System.out.println("eat(): "+" Waiting for "+name+" to serve");
			//Unhandled exception type InterruptedException
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted....");
			}
		}
		System.out.println("eat(): "+ name+" is eaten..." );
	}
	
	public synchronized void serve() { //Server thread
		if(isServed==false) {
			System.out.println("serve(): "+name+" is served");
			isServed=true;
			notify();
		}
	}
}







class Eater extends Thread 
{
	FoodItem food;
	
	Eater(FoodItem food) {
		this.food = food;
	}
	
	public void run() {
		food.eat();
	}
}

class Server extends Thread
{
	FoodItem food;
	
	Server(FoodItem food) {
		this.food = food;
	}
	
	public void run() {
		food.serve();
	}
}


