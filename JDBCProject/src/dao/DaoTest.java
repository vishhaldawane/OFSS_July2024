package dao;

import java.util.List;

//18:00

public class DaoTest {
	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAOImpl();

		dao.readDepartmentsInJSON();
		
		/*Department dept = new Department();
		dept.setDepartmentNumber(10);
		dept.setDepartmentName("Acc");
		dept.setDepartmentLocation("NY");
		
		dao.updateDepartment(dept);*/
		
		//dao.deleteDepartment(50);
		
		
		/*
		List<Department> deptList = dao.readDepartments();
		for(Department dept : deptList) {
			System.out.println("DEPT NO    : "+ dept.getDepartmentNumber());
			System.out.println("DEPT NAME  : "+ dept.getDepartmentName());
			System.out.println("DEPT LOC   : "+ dept.getDepartmentLocation());
			System.out.println("---------------------");
		}
		*/
		
		
		/*Department dept = new Department();
		dept.setDepartmentNumber(50);
		dept.setDepartmentName("QMS");
		dept.setDepartmentLocation("Pune");
		
		dao.createDepartment(dept);
		dao.deleteDepartment(10);
		
		System.out.println("--------------");*/
		
		/*Department dept30 = dao.readDepartment(40);
		System.out.println("DEPT NO    : "+ dept30.getDepartmentNumber());
		System.out.println("DEPT NAME  : "+ dept30.getDepartmentName());
		System.out.println("DEPT LOC   : "+ dept30.getDepartmentLocation());
		 */
		
		
		
	}
}






