import java.io.*;
class Person
{
    int age; 	//data members
    String name; 
    public void setPerson(int a,String n)
    {
        age = a;
        name = n;
    }
    public void dispPerson() //member functions
    {
        System.out.println("Name :" + name + " Age : " + age);
    }
}
public class prog5Person
{
	public static void main(String[] args) {
    	Person p,q;
    	p = new Person();
    	q = new Person();
    	p.setPerson(21,"Anjaleena Sarah");
    	q.setPerson(30,"Alfia K H");
    	p.dispPerson();
    	q.dispPerson();
	}
}