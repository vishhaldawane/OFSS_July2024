import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DivisionTest {
	public static void main(String[] args) throws IOException
	{
	
		System.out.println("1. Begin main\n");
		//Unhandled exception type FileNotFoundException
		//Unhandled exception type IOException
		
		
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
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		int z = 100 / 0;
		System.out.println("8. Division : "+z);*/
		
		System.out.println("\n9.End of main");
		
	}
}

class Calculator
{
	
}
