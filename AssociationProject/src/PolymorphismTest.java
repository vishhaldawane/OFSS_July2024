
class Doctor
{
	void diagnose() {
		System.out.println("Doctor: diagnose() .. EENTT checkup");
	}
	
	void talk() {
		
	}
	void talk(int i) {
		
	}
	void talk(String msg) {
		
	}
}

class Surgeon extends Doctor // isA
{
	//overriding - method signature is same as of the parent
	void diagnosed() {
		System.out.println("Surgeon: diagnose() .. CT Scan checkup");
	}
	void cut() {
		System.out.println("Surgeon: cut()....invoked...");
	}
}

class HeartSurgeon extends Surgeon // isA
{
	//overriding - method signature is same as of the parent
	void diagnosed() {
		System.out.println("HeartSurgeon: diagnose() .. MRI Scan checkup");
	}
	void cut() {
		System.out.println("HeartSurgeon: cut()....invoked...");
	}
	void openHeartSurgery() {
		System.out.println("HeartSurgeon: openHeartSurgery()....invoked...");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
	
		Doctor doctor = new Doctor();	
		doctor.diagnose(); // Doctor::diagnose()
		System.out.println("---------");
		
		Surgeon surgeon = new Surgeon();
		surgeon.diagnose(); // Surgeon::diagnose()
		surgeon.cut();
		
		System.out.println("---------");

		HeartSurgeon heartSurgeon = new HeartSurgeon();
		heartSurgeon.diagnose(); //early binding
		heartSurgeon.cut(); //early binding
		heartSurgeon.openHeartSurgery(); //early binding
		
		System.out.println("-----------------------------");
		
		Doctor x = new Doctor();
		
		x.diagnose(); // compile time binding of Doctor::diagnose()
		
		x = new Surgeon(); //super class reference can point to the child
			//but that does not mean it has access to child's specialized
			//function
		
		//x.cut();
		
		x.diagnose(); // compile time binding of Doctor::diagnose()
		//x.cut();
		
		if(x instanceof Surgeon) {
			Surgeon s = (Surgeon) x;
			s.cut();
			
		}
		
		x = new HeartSurgeon();
		
		x.diagnose(); // compile time binding of Doctor::diagnose()
		//x.cut();
		//x.openHeartSurgery();
		
		x.talk();
		x.talk(12);
		x.talk("msg is prescribed");
		
		
		
		
		
		
		
		
		
		
		
	}
}
