import java.sql.*;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//1. Get connection to DB
			Connection myConn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/todos", "root", "imower12");
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute a SQL query
			ResultSet myRs = myStmt.executeQuery("select * from todos");
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("todo_text"));
			}
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Failed to connect to MySQL Database");
		}
	}

}
