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
	
}
