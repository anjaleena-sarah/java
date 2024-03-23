import java.io.*;
import java.net.*;
class Client {
   public static void main(String args[]) {
	Socket cs;
	DataInputStream sin;
	DataOutputStream sout;
	try {
	   cs = new Socket("localhost",1234);
	   sin = new DataInputStream(cs.getInputStream());
	   sout = new DataOutputStream(cs.getOutputStream());
	   String str = sin.readUTF();
	   System.out.println("Server Says :" + str);
	   sout.writeUTF("Bye");
	   System.in.read();
	}
	catch(Exception e) {
		System.out.println("Error :" + e);
	}
  }
}