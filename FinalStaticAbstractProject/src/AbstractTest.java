
public class AbstractTest {
	public static void main(String[] args) {
		Square square = new Square(50);
		Rectangle rect = new Rectangle();
		Triangle tria = new Triangle();
		
		Geometry.processAllImages(square);
		Geometry.processAllImages(rect);
		Geometry.processAllImages(tria);
		
		
	}
}
/*---------------*/
class Geometry
{
	//dynamic method dispatch in C++
	static void processAllImages(GeometricalShape x) {
		//logic to process - 30 lines
		if(x instanceof Square) {
			Square sq = (Square) x;
		}
	}
	/*
	static void processAllImages(Square x) {
		//logic to process - 30 lines
	}
	static void processAllImages(Rectangle x) {
		//logic to process - 30 lines
	}
	static void processAllImages(Triangle x) {
		//logic to process - 30 lines
	}*/
}
/*---------------*/

//draw any geometrical shape
//
//cannot create instance of the abstract class
abstract class GeometricalShape //<-- symmetry
{
	abstract void draw();
	abstract void calcArea();
	abstract void calcPeriphery();
}

class Square extends GeometricalShape
{
	int side;
	
	 Square(int s) {
		 side = s;
	 }
	 
	 void draw() {
		 System.out.println("Drawing Square...");
	 }
	 void calcArea() {
		 System.out.println("Calculating area of the Square...");
		 float area = side * side;
		 System.out.println("area      : "+area);
	 }
	 void calcPeriphery() {
		 float peri = 4*side;
		 System.out.println("Calculating perimeter of the square...");
		 System.out.println("perimeter : "+peri);
	 }
}


class Rectangle extends GeometricalShape {
	
	int side2;

@Override
void draw() {
	// TODO Auto-generated method stub
	
}

@Override
void calcArea() {
	// TODO Auto-generated method stub
	
}

@Override
void calcPeriphery() {
	// TODO Auto-generated method stub
	
}
}


class Triangle extends GeometricalShape {
	
	int side1, side2,side3;

@Override
void draw() {
	// TODO Auto-generated method stub
	
}

@Override
void calcArea() {
	// TODO Auto-generated method stub
	
}

@Override
void calcPeriphery() {
	// TODO Auto-generated method stub
	
}
}



