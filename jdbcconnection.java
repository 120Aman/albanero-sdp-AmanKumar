package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
public class jdbcconnection {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	  
	   public static void main(String[] args) {
	      try {
	        Class.forName("com.mysql.jdbc.Driver");

	        Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost/students", "root", "");
	        Statement stmt = conn.createStatement();
	        String sql = "SELECT *FROM ONE";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        System.out.println("Inserted records into the table...");
	        while(rs.next())
	        {
	        	System.out.println(rs.getString(1)+"  "+ rs.getString(2));
	        }
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	   }
}

