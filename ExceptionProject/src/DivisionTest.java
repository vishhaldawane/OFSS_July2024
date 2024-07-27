import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//The JPL - James Gosling Ken Arnold David Holmes

public class DivisionTest {
	public static void main(String[] args) throws IOException
	{
	
		System.out.println("Begin main\n");
			
		Calculator calci = new Calculator();
		calci.divide(100, 20);
		calci.divide(100, 10);
		calci.divide(100, 0);
		calci.divide(100, 16);
		calci.divide(100, 35);
		
		
		
		System.out.println("\nEnd of main");
		
	}
}

class Calculator
{
	
	void divide(int num, int deno) 
	{
		System.out.println("Dividing "+num+"/"+deno);
		try {
			int div = num / deno;
			System.out.println("Division : "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}
	}
	
}



//Unhandled exception type FileNotFoundException
		//Unhandled exception type IOException
		
		/*
			System.out.println("Trying to open the file....");
			FileInputStream fin = new FileInputStream("/Users/apple/a.txt");
			System.out.println("File is ready....");
			int ch = fin.read(); //read first letter
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=fin.read(); //read successive letters
			}
			fin.close();
			System.out.println("File is closed....");
	*/
		


