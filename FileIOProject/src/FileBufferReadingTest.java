import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferReadingTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to open the file....");
			FileInputStream fin = new FileInputStream("/Users/apple/ofss/Java/JavaNotes.txt");
			System.out.println("File is ready....");
			int ch = fin.read(); //read first letter
			while(ch!=-1) {
				//System.out.print((char)ch);
				ch=fin.read(); //read successive letters
				//Thread.sleep(1);
			}
			fin.close();
			System.out.println("File is closed....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}

