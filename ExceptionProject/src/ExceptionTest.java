
public class ExceptionTest {
	public static void main(String[] args) {
		
		System.out.println("line1");
		System.out.println("line2");
		if(10>50)
			throw new RuntimeException("Something happened.1...");
		
		System.out.println("line3");
		System.out.println("line4");
		System.out.println("line5");
		if(70>80)
			throw new RuntimeException("Something happened..2..");
		
		System.out.println("line6");
		System.out.println("line7");
		if(27<32)
			throw new RuntimeException("Something happened.3...");
		
		System.out.println("line8");
		System.out.println("line9");
		System.out.println("line10");
		
	}
}
