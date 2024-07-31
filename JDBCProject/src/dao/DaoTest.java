package dao;

public class DaoTest {
	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAOImpl();

		
		/*Department dept = new Department();
		dept.setDepartmentNumber(50);
		dept.setDepartmentName("QMS");
		dept.setDepartmentLocation("Pune");
		
		dao.createDepartment(dept);
		dao.deleteDepartment(10);
		
		System.out.println("--------------");*/
		
		Department dept30 = dao.readDepartment(40);
		System.out.println("DEPT NO    : "+ dept30.getDepartmentNumber());
		System.out.println("DEPT NAME  : "+ dept30.getDepartmentName());
		System.out.println("DEPT LOC   : "+ dept30.getDepartmentLocation());

	}
}






