import java.time.LocalDateTime;

public class ArrayListTest {
	public static void main(String[] args) {
		PhoneLog log1 = new PhoneLog("Dialled","Reeta",LocalDateTime.of(2024, 7, 27, 10, 30));
		PhoneLog log2 = new PhoneLog("Missed","Meeta",LocalDateTime.of(2024, 7, 27, 20, 30));
		PhoneLog log3 = new PhoneLog("Recieved","Neeta",LocalDateTime.of(2024, 7, 28, 11, 45));
		PhoneLog log4 = new PhoneLog("Dialled","Seeta",LocalDateTime.of(2024, 7, 29, 12, 34));
		PhoneLog log5 = new PhoneLog("Missed","Jeeta",LocalDateTime.of(2024, 7, 29, 9, 54));

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
		
		
		
	}
}
class PhoneLog
{
	String logType; // missed, recieved, dialled
	String contact;
	LocalDateTime timestamp;
	
	public PhoneLog(String logType, String contact, LocalDateTime timestamp) {
		super();
		this.logType = logType;
		this.contact = contact;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "PhoneLog [logType=" + logType + ", contact=" + contact + ", timestamp=" + timestamp + "]";
	}
	
	
}