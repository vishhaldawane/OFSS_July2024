package dao;

import java.util.List;

public interface DepartmentDAO { //DepartmentRepository
	//CRUD
	
	void             createDepartment(Department deptObj);
	Department 		 readDepartment(int deptno);
	List<Department> readDepartments();
	void             updateDepartment(Department deptObj);
	void 			 deleteDepartment(int deptno);
}
