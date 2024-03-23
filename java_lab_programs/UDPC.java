import java.net.*;
import java.io.*;

class UDPC
{
	public static void main(String args[])
	{
		DatagramSocket ds = null;
		InetAddress shost = null;
		DatagramPacket dp = null , reply = null;
		try
		{
			ds = new DatagramSocket();
			byte [] m = "Bye".getBytes();
			shost = InetAddress.getByName("localhost");
			dp =new DatagramPacket(m, 3, shost, 1234);
			ds.send(dp);
			byte[] buffer = new byte[1000];
			reply = new DatagramPacket(buffer, buffer.length);
			ds.receive(reply);
			System.out.println("Reply: " + (new String(reply.getData())).trim());
		}
		catch (SocketException e) 
		{
			System.out.println("Socket: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("IO: " + e.getMessage());
		}
		finally 
		{
			if (ds != null)
			ds.close();
		}
	}
}