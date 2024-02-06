import java.io.*;
class prog1CRead
{
  public static void main(String args[])
  {
	DataInputStream din;
	String name;
	int age;
	String s;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter your name");
	 name = din.readLine();
	 System.out.println("Enter your age");
	 s = din.readLine();
	 age = Integer.parseInt(s);
	 System.out.println("Name : " + name);
	 System.out.println("Age  : " + age);
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}