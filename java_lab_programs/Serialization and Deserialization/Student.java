import java.io.Serializable;  
public class Student implements Serializable
{  
 	private transient int id; 
	private int rollno; 
 	private transient String name;  
 	public Student(int id,int rollno, String name) 
	{  
  		this.id = id;  
		this.rollno = rollno;
  		this.name = name;  
 	}  
	public void disp()
	{
  	  System.out.println(id+" " + rollno + "  "+name);
	}	
}  