import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to open the file....");
			FileInputStream fin1 = new FileInputStream("/Users/apple/ofss/Java/c.txt");
			
			FileInputStream fin2 = new FileInputStream("/Users/apple/ofss/Java/c.txt");
			BufferedInputStream buff = new BufferedInputStream(fin2);
			
			System.out.println("File is ready....with fin1");
			long start = System.nanoTime();
    
			int ch = fin1.read(); //read first letter
			while(ch!=-1) {
				ch=fin1.read(); //read successive letters
			}
			long duration = (System.nanoTime() - start)/1000000;
		    System.out.println(duration + "ms without buffering");
		       
			fin1.close();
			System.out.println("File is closed....");
			
			System.out.println("File is ready....with fin2 plus buff");
			long start2 = System.nanoTime();

			ch = buff.read(); //read first letter
			while(ch!=-1) {
				ch=buff.read(); //read successive letters
			}
			long duration2 = (System.nanoTime() - start2)/1000000;
		    System.out.println(duration2 + "ms with buffering");
		   
			buff.close();
			fin2.close();
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

