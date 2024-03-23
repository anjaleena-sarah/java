import java.net.*;
import java.io.*;
class UDPS
{
	public static void main(String args[])
	{
		DatagramSocket ds = null;
		DatagramPacket dp = null, reply;
		try 
		{
			ds = new DatagramSocket(1234);
			byte[] buffer = new byte[1000];
			dp = new DatagramPacket(buffer,buffer.length);
			ds.receive(dp);
			System.out.println("From Clinet: " + (new String(dp.getData())).trim());
			System.out.println("Client PORT : "+ dp.getPort());
			reply = new DatagramPacket("From Server ok".getBytes(),"From Server ok".length(),dp.getAddress(),dp.getPort());
			ds.send(reply);
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