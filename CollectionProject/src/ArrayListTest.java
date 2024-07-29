import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListTest {
	public static void main(String[] args) {
		PhoneLog log1 = new PhoneLog(3,"Dialled","Reeta",LocalDateTime.of(2024, 7, 27, 10, 30));
		PhoneLog log2 = new PhoneLog(4,"Missed","Meeta",LocalDateTime.of(2024, 7, 27, 20, 30));
		PhoneLog log3 = new PhoneLog(5,"Recieved","Neeta",LocalDateTime.of(2024, 7, 28, 11, 45));
		PhoneLog log4 = new PhoneLog(2,"Dialled","Seeta",LocalDateTime.of(2024, 7, 29, 12, 34));
		PhoneLog log5 = new PhoneLog(1,"Missed","Jeeta",LocalDateTime.of(2024, 7, 29, 9, 54));

		
		//10
		System.out.println("Container as growable array....");
		//ArrayList<PhoneLog> listLogs = new ArrayList<PhoneLog>();
		
		
		//PhoneContact - contactNumber,contactName,emailAddress,speedDial
		//LinkedList<PhoneLog> listLogs = new LinkedList<PhoneLog>();
		
		
		//ChemicalElement - atomicNumber,atomicName,atomicWeight,atomicFormula
		TreeSet<PhoneLog> listLogs = new TreeSet<PhoneLog>();
		
		
		//Book - bookNumber, bookName, authorName, numberOfPages, bookPrice
		//HashSet<PhoneLog> listLogs = new HashSet<PhoneLog>();
		
		System.out.println("Adding log to the Container....");
		listLogs.add(log1); //1
		listLogs.add(log2); //2 
		listLogs.add(log3); //3
		listLogs.add(log4); //4
		listLogs.add(log5); //5
		Iterator<PhoneLog> iterator = listLogs.iterator();
		while(iterator.hasNext()) {
			PhoneLog theLog = iterator.next();
			System.out.println("The Log : "+theLog);
		}
		
	}
}
class PhoneLog implements Comparable<PhoneLog>
{
	int num;
	String logType; // missed, recieved, dialled
	String contact;
	LocalDateTime timestamp;
	
	public PhoneLog(int num,String logType, String contact, LocalDateTime timestamp) {
		super();
		this.num=num;
		this.logType = logType;
		this.contact = contact;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "PhoneLog [num="+num+" logType=" + logType + ", contact=" + contact + ", timestamp=" + timestamp + "]";
	}
	@Override
	public int compareTo(PhoneLog o) {
		System.out.println("Comparing "+num+" with "+o.num +" value : "+(num-o.num));
		//return logType.compareTo(o.logType);
		return Integer.compare(num, o.num);
	}
	
	
}
		/*
		 System.out.println("Creating array as Container...");

		PhoneLog allLogs[] = new PhoneLog[5];
		   
		System.out.println("Storing PhoneLog as Content in the Container...");

		allLogs[0] =log1;
		allLogs[1] =log2;
		allLogs[2] =log3;
		allLogs[3] =log4;
		allLogs[4] =log5;
		
		System.out.println("Using For LOOP as Iterator to step through the Container...");
		for(int i=0;i<allLogs.length;i++) {
			System.out.println("Log : "+allLogs[i]);
		}
		
		System.out.println("======================");
		 
		 */
		
		
		
		
		
		
		