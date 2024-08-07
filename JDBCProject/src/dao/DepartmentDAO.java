package dao;

import java.util.List;

import org.json.simple.JSONArray;

public interface DepartmentDAO { //DepartmentRepository
	//CRUD
	
	void             createDepartment(Department deptObj);
	Department 		 readDepartment(int deptno);
	List<Department> readDepartments();
	JSONArray 		 readDepartmentsInJSON();

	
	//List<Department> readDepartmentsByLoc(String loc);
	
	void             updateDepartment(Department deptObj);
	void 			 deleteDepartment(int deptno);
}
