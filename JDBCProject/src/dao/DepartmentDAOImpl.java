package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	Connection conn=null;
	
	public DepartmentDAOImpl() {
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver registerd....");
			
			System.out.println("Trying to connect to the DB");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root123");
			System.out.println("Connected to the DB : "+conn);
		}
		catch(Exception e) {
			System.out.println("Problem : "+e);
		}
			//Statement st = conn.createStatement();
			//System.out.println("Statement created : "+st);
			
	}
	
	@Override
	public void createDepartment(Department deptObj) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into dept values (?,?,?)");
			pst.setInt(1,deptObj.getDepartmentNumber());
			pst.setString(2, deptObj.getDepartmentName());
			pst.setString (3,deptObj.getDepartmentLocation());		
			int rows = pst.executeUpdate();
			System.out.println(rows+" Record(s) inserted : ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Department readDepartment(int deptno) {
		Department dept = null;

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from dept where deptno="+deptno);
			if(result.next()) {
				dept = new Department();
				dept.setDepartmentNumber(result.getInt(1));
				dept.setDepartmentName(result.getString(2));
				dept.setDepartmentLocation(result.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}

	@Override
	public List<Department> readDepartments() {
		Department dept = null;
		ArrayList<Department> deptList = new ArrayList<Department>();
		
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from dept");
			
			while(result.next()) {
				dept = new Department(); //blank object
				dept.setDepartmentNumber(result.getInt(1)); //fill it up
				dept.setDepartmentName(result.getString(2));
				dept.setDepartmentLocation(result.getString(3));
				deptList.add(dept);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

	@Override
	public void updateDepartment(Department deptObj) {

		try {
			PreparedStatement pst = conn.prepareStatement("update dept set dname=?, loc=? where deptno=?");
			
			pst.setInt(3,deptObj.getDepartmentNumber()); //WHERE
			
			pst.setString(1, deptObj.getDepartmentName()); //set col1
			pst.setString (2,deptObj.getDepartmentLocation());		 //set col2
			int rows = pst.executeUpdate();
			System.out.println(rows+" Record(s) updated : ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDepartment(int deptno) {
		try {
			PreparedStatement pst = conn.prepareStatement("delete from dept where deptno=?");
			
			pst.setInt(1,deptno); //WHERE
			
			int rows = pst.executeUpdate();
			System.out.println(rows+" Record(s) deleted : ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
