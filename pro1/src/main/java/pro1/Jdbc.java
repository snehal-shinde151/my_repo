package pro1;
import java.sql.*;

public class Jdbc {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="admin";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from StudRegis");
			 while(rs.next())
			 {
				 String data=rs.getString("emp_id")+" "+rs.getString("fname")+" "+rs.getString("lname")+" "+rs.getString("salary")+" "+rs.getString("dept_id")+" "+rs.getString("hiredate");
			  System.out.println(data);
			 }
			 if(connection !=null) {
				 
			 }
			 connection.close();
		}
			 catch(ClassNotFoundException e) {
				 System.out.println("oracle JDBC Driver not found.");
				 e.printStackTrace();
			 }
		catch(SQLException e) {
					 System.out.println("Connection failed");
					 e.printStackTrace();

				 
				 
			 
		}
	}

}
