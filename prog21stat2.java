import java.io.*;
class c1
{
	public static void disp()
	{
		System.out.println("In disp c1");
	}
}
class c2
{
	public static void disp()
	{
		System.out.println("In disp c2");
	}
}
class prog21stat2

{
	public static void disp()
	{
		System.out.println("In disp ");
	}
	public static void main(String args[])
	{
		disp();
		c1.disp();
		c2.disp();	
	}
}