import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Department;
import dao.DepartmentDAO;
import dao.DepartmentDAOImpl;

public class DepartmentTest {

	DepartmentDAO deptDAO;
	
	@BeforeEach
	public void init() {
		deptDAO = new DepartmentDAOImpl();
	}
//Developer -> Tester -> Deployer [ webapp-pack, webapp-deploy ]	
	@Test
	public void selectAllDeptTest() {
		List<Department> depts = deptDAO.readDepartments();
	Assertions.assertTrue(depts!=null);
		System.out.println("depts is initialized...");
	Assertions.assertTrue(depts.size()>0);
		for (Department department : depts) {
			System.out.println("Dept : "+department);
		}
	}
	
	@Test
	public void transferTest() {
		SavingsAccount src = new SavingsAccount();
		Assertions.assertTrue(src!=null);
		
		SavingsAccount trg = new SavingsAccount();
		Assertions.assertTrue(trg!=null);
		
		src.withdraw(5000);
		trg.deposit(5000);
		
		
		
		
		
	}
	//chef -> make the biryani
	
	//tester might have 10 test cases
			
	@Test
	public void saltTest() {
		//.....
	}
	@Test public void riceCoockedTest() {
		
	}
	
	//OR
	
	public void testCase() {
		//code for chcking salt
		
		//code for checking rice cooked or not
	}
}
