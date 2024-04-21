import java.io.*;
class prog3CSum
{
  public static void main(String args[])
  {
	DataInputStream din;
	String s;
	int a,b;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the first no");
	 s = din.readLine();
	 a = Integer.parseInt(s);
	 System.out.println("Enter the second no");
	 s = din.readLine();
	 b = Integer.parseInt(s);
	 System.out.println("sum of " + a + " and " + b  +" is " + (a+b));
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}