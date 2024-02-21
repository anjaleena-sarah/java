import java.io.*;
interface ishape
{
	public double area();
	public double perimeter();
}
class rectangle implements ishape
{
	double l,b;
	public rectangle(double l,double b)
	{
		this.l = l;
		this.b = b;
	}
	public double area()
	{
		return l * b;
	}
	public double perimeter()
	{
		return 2 * ( l + b);
	}
}
class circle implements ishape
{
	double r;
	public circle(double r)
	{
		this.r = r;
	}
	public double area()
	{
		return 22/7 * r * r;
	}
	public double perimeter()
	{
		return 2 * 22 / 7 * r;
	}
}
class prog18mareacl
{
	public static void main(String args[])
	{
		ishape obj[];
		int n,i,ch;
		DataInputStream din = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the no of objects");
			n = Integer.parseInt(din.readLine());
			obj = new ishape[n];
			for(i = 0;i < n;i++)
			{
				System.out.println("1. Rectangle\n2. Circle");
				ch = Integer.parseInt(din.readLine());
				if(ch == 1)
				{
				   double l,b;
				   System.out.println("Enter the l and b");
				   l = Double.parseDouble(din.readLine());
				   b = Double.parseDouble(din.readLine());
				   obj[i] = new rectangle(l,b);
				}
				else
				{
				   double r;
				   System.out.println("Enter the r");
				   r = Double.parseDouble(din.readLine());
				   obj[i] = new circle(r);
				}
			}
			for(i = 0;i < n;i++)
			{
				System.out.println(obj[i].area());	
				System.out.println(obj[i].perimeter());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}