import java.io.*;
class prog4CArray
{
  public static void main(String args[])
  {
	DataInputStream din;
	int a[],n,i;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the limit");
	 n = Integer.parseInt(din.readLine());
	 a = new int[n];
	 for(i = 0;i < n;i++)
	 {
 		System.out.println("Enter a[" + i + "]");
		a[i] = Integer.parseInt(din.readLine());
	  }
	  for(i=n-1;i >= 0;i--)
	  {
		System.out.print(a[i] + "  " );
	  }
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}