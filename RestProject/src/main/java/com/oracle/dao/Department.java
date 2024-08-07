package com.oracle.dao;
//DAO - data access object = 
// separate the low level data access logic

//POJO - plain old java object

//the class will have structure 
//identical as of the table

//mapping of OBJECT with DB table - ORM

//LAYER:1 --> table

//LAYER:2 --->POJO - Department

//LAYER:3 ----->DAO interface with implementation | Repository
		//DepartmentDAO				DepartmentDAOImpl

public class Department { //same as Dept table
	
	private int departmentNumber; //same as deptno
	private String departmentName; //same as dname
	private String departmentLocation; //same as loc
	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
}
