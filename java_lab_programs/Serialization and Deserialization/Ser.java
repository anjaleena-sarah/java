import java.io.*;  
class Ser
{  
	public static void main(String args[])throws Exception
	{  
		Student s1 =new Student(100,200,"abcd");  
  		FileOutputStream fout=new FileOutputStream("f.txt");  
		ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  		out.writeObject(s1);  
		out.flush();  
		System.out.println("success");  
 	}  
}  