import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectWhereTest {
	public static void main(String[] args) {
		//load the driver
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver registerd....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root123");
			System.out.println("Connected to the DB : "+conn);
			
			Statement st = conn.createStatement();
			System.out.println("Statement created : "+st);
			
			System.out.println("select * from emp where job ? ");
			Scanner scanner = new Scanner(System.in);
			String scannedJob = scanner.next();
			
			ResultSet result = st.executeQuery("select * from emp where job="+"'"+scannedJob+"'");
			System.out.println("Got the result..."+result);
			
			Console console = System.console();
			
			while(result.next()) {
				int empno = result.getInt(1);
				String ename = result.getString(2);
				String job = result.getString(3);
				//console.printf("%5d|%20s|%10s|\n",empno,ename,job);
				System.out.print(empno+"\t");
				System.out.print(ename+"\t");
				System.out.print(job+"\t");
				System.out.println("\n---------------------");
				
			}
			
			result.close();
			st.close();
			conn.close();
			System.out.println("ALL db resources are closed....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
