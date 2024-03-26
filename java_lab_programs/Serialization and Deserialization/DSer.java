import java.io.*;  
class DSer
{  
	public static void main(String args[])throws Exception
	{  
		FileInputStream fin = new FileInputStream("f.txt");
		ObjectInputStream in=new ObjectInputStream(fin);  
  		Student s=(Student)in.readObject();  
		s.disp();  
  		in.close();  
 	}  
}  