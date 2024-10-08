
public class InheritanceTest {
	public static void main(String[] args) {
		Person personObj = new Person('F',"Jane",23);
		personObj.aadhar.setAadharCard("123456781234", "Jane Dsouza", "West Avenue, Bandra, 400020", "9820445678");
		System.out.println("personObj : "+personObj);
		personObj.think(); // Human::think()
		personObj.feel(); // Human::feel()
		System.out.println("---------");
		
		Student student = new Student('F',"Julie",25,1234);
		student.aadhar.setAadharCard("111133334444", "Julie Dmello", "Sadashiv Peth, Pune, 411011", "8877664434");
		System.out.println("student : "+student);
		student.think();
		student.feel();
		student.study();
		student.solveAssignments();
		student.doHomeWork();
	}
}

class Human {

	void think() { //exclusive
		System.out.println("Human is thinking...of the life...");
	}
	void feel() {
		System.out.println("Humam is feeling...");
	}
}
class AadharCard
{
	String aadharNumber; //12 digit
	String aadharName; //name of it
	String aadharAddress; // address
	String phoneNumber; //phone associated
	public void setAadharCard(String aadharNumber, String aadharName, String aadharAddress, String phoneNumber) {
		this.aadharNumber = aadharNumber;
		this.aadharName = aadharName;
		this.aadharAddress = aadharAddress;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AadharCard [aadharNumber=" + aadharNumber + ", aadharName=" + aadharName + ", aadharAddress="
				+ aadharAddress + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}

class Person extends Human { //isA - single level
	
	private char gender;
	private String name;
	private int age;
	AadharCard aadhar = new AadharCard(); //hasA
	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	void think() { //inherited-cum-overridden
		System.out.println("Person is thinking...of personality");
	}
	

	
	
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
	void persona() {
		System.out.println("A type of a person with certain features...");
	}
}

class Student extends Person//isA - multi-level
{
	int rollNumber;		
	public Student(char gender, String name, int age, int rollNumber) {
		super(gender, name, age);
		this.rollNumber = rollNumber;
	}
	void think() { //inherited-cum-overridding
		System.out.println("Student is thinking...of the exam....");
	}
	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", rollNumber=" + rollNumber + "]";
	}
	void study() {
		System.out.println("Student is studying...");
	}
	void doHomeWork() {
		System.out.println("Student is doing homework...");

	}
	void solveAssignments() {
		System.out.println("Student is solving assignments...");

	}
}





