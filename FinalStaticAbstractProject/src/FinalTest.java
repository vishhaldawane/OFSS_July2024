
public class FinalTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(20);
		Circle circle3 = new Circle(30);
	
		Car car1 = new Car("MH-01-XA-664","BMW");
		Car car2 = new Car("MH-01-XA-664","BMW");
		Car car3 = new Car("MH-01-XA-664","BMW");
		
	}
}
class Car
{
	final String numberPlate;
	static double SPEED_OF_LIGHT;//=186000.519;
	
	Car(String np) {
		numberPlate =np;
		SPEED_OF_LIGHT=186000.519;
	}
	Car(String np,String model) {
		numberPlate =np;
		SPEED_OF_LIGHT=186000.519;
	}
	
	void setCar(String np) {
		//numberPlate =np;
	}
	
	
}
class Circle
{
	float radius;
	static final float PI=3.14f; //constant
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	void calculateArea() {
		float area = PI*radius * radius;
	}
}
