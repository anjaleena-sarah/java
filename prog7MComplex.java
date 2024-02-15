import java.io.*;
class Complex
{
   float r,i;
   public void read() 
   {
	DataInputStream din = new DataInputStream(System.in);
	try
	{
		System.out.println("Enter the real part");
		r = Float.parseFloat(din.readLine());
		System.out.println("Enter the imaginary part");
		i = Float.parseFloat(din.readLine());
	}
	catch(Exception e)
	{
		System.out.println("Error " + e);
	}
    }
    public void disp()
    {
	System.out.println("real : " + r + " imag : " + i);
    }
    public Complex add(Complex q)
    {
	Complex t = new Complex();
	t.r = r + q.r;
	t.i = i + q.i;
	return t;	
    }
    public Complex mult(Complex q)
    {
	Complex t = new Complex();
	t.r = r * q.r - i * q.i;
	t.i = r * q.i + i * q.r ;
	return t;	
    }
}
class prog7MComplex
{
  public static void main(String args[])
  {
	Complex p,q,r;
	p = new Complex();
	q = new Complex();
	p.read(); 
	q.read(); 
	r = p.add(q);
	p.disp();
	q.disp();
	r.disp();	
	r = p.mult(q);
	r.disp();
  }
}