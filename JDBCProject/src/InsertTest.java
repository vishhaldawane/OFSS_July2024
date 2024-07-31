import java.io.Console;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		//load the driver
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver registerd....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root123");
			System.out.println("Connected to the DB : "+conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?) ");
			pst.setInt(1,2222);
			pst.setString(2, "Sachin T");
			pst.setString (3,"Cricketer");
			pst.setInt(4,7839);
			pst.setDate(5,Date.valueOf("1998-2-10"));
			pst.setFloat(6,8888);
			pst.setFloat(7, 444);
			pst.setInt(8, 10);
			
			int rows = pst.executeUpdate();
			System.out.println(rows+" Record(s) inserted : ");

			
			pst.close();
			conn.close();
			System.out.println("ALL db resources are closed....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
