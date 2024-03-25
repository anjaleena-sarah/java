import java.io.*;
import java.util.*;
import java.sql.*;
class DBI {

   public static void main(String args[]) {
	Connection con;
	Statement st;
	int no;
	String name;
	float sal;
	Scanner s = new Scanner(System.in);
	try {
	  Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8","root","");
	  st = con.createStatement();
	  System.out.println("Enter no name and salary");
	  no = s.nextInt();  //10_
	  s.nextLine();
	  name = s.nextLine();
	  sal = s.nextFloat();
	//   String str = "insert into emp values(2,'ddd',40000)";
	  String str = "insert into emp values(";
	  str = str + no + ",'"+name+"',"+sal+")";
	//   str = str + name + "',";
	//   str = str + sal +")";
	  System.out.println(str);
	  st.executeUpdate(str);
	  System.out.println("4");
	  System.out.println("One Record is Inserted..");
 	}
	catch(Exception e) {
		System.out.println("Error " + e);
	}
  }
}