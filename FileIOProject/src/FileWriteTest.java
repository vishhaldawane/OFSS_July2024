import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new 
					FileOutputStream("/Users/apple/ofss/Java/prince.txt",true);
			System.out.println("File is ready for writing...");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter data : ");
			String data = scan.nextLine(); // a line with Enter key
			byte array[] = data.getBytes();//convert str into byte ary
			fout.write(array);
			System.out.println("Data is written to the file...");
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
