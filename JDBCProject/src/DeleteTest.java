import java.io.Console;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) {
		//load the driver
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver registerd....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root123");
			System.out.println("Connected to the DB : "+conn);
			
			conn.setAutoCommit(false);  //transaction management started
			
			
			Scanner scanner = new Scanner(System.in);

			PreparedStatement pst = conn.prepareStatement("delete from emp where empno=?");
			System.out.println("Enter emp number to delete ? ");
			String employeeNumber = scanner.next();
			int eno = Integer.parseInt(employeeNumber);
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp where empno="+eno);
			if(rs.next()) {
				pst.setInt(1,eno);
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Are you sure to delete ? ");
				String answer = scanner2.next();
				int rows = pst.executeUpdate();

				if(answer.equalsIgnoreCase("yes")) {
					conn.commit();
					System.out.println(rows+" Record(s) deleted : ");
				}
				else {
					conn.rollback();
					System.out.println(rows+" Record(s) NOT deleted : ");			
				}
			}
			else {
				throw new EmployeeNotFoundException("Employee with this id does not exists : "+eno);
			}
			pst.close();
			conn.close();
			System.out.println("ALL db resources are closed....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
