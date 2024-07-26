import java.time.LocalDateTime;

public class BankTest1 {
	public static void main(String[] args) {
		
		BankAccount1 baObj1 = new BankAccount1();
		baObj1.setBankAccount1(101, "Jane", 6000, LocalDateTime.now());
		System.out.println("baObj1 : "+baObj1);
		
		BankAccount1 baObj2 = new BankAccount1();
		baObj2.setBankAccount1(102, "Janet", 7000, LocalDateTime.now());
		System.out.println("baObj2 : "+baObj2);
		
		BankAccount1 baObj3 = new BankAccount1();
		baObj3.setBankAccount1(103, "Julie", 8000, LocalDateTime.now());
		System.out.println("baObj3 : "+baObj3);
		
	}
}
