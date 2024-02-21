//Program for late binding or dynamic or run time polymorphism

import java.io.*;
interface ishape
{
	public void draw();
	public void move();
}
class line implements ishape
{
	public void draw()
	{
		System.out.println("Line Draw");
	}
	public void move()
	{
		System.out.println("Line Move");
	}
}
class circle implements ishape
{
	public void draw()
	{
		System.out.println("Circle Draw");
	}
	public void move()
	{
		System.out.println("Circle Move");
	}
}
class prog17latebinding
{
	public static void main(String args[])
	{
		ishape obj;
		obj = new line();
		obj.draw();
		obj.move();
		obj = new circle();
		obj.draw();
		obj.move();
	}
}