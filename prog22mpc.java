class pc
{
	static int count=0;
	int a;
	private pc()
	{
		a = 10;
	}
	public void disp()
	{
		System.out.println(a);
	}
	public static pc create()
	{
		count++;
		return new pc();
	}
}
class prog22mpc
{
	public static void main(String args[])
	{
		pc obj = pc.create();
		pc obj2 = pc.create();
		obj.disp();
		obj2.disp();
		System.out.println(pc.count);
	}
}