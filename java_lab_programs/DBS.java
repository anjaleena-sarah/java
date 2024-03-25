import java.io.*;
import java.util.*;
import java.sql.*;
class DBS {
   public static void main(String args[]) {
	Connection con;
	Statement st;
	ResultSet rs;
	try {
	  Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");
	  st = con.createStatement();
	  String str = "select * from emp";
	 rs = st.executeQuery(str);
	 while(rs.next()) {
		System.out.println(rs.getString("eid") + "  " + rs.getString("empname") + "  " + rs.getString("esal"));
	  }
 	}
	catch(Exception e) {
		System.out.println("Error " + e);
	}
  }
}
