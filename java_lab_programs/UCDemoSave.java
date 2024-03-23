import java.net.*; 
import java.io.*; 
import java.util.Date; 

class UCDemoSave 
{ 
	public static void main(String args[]) throws Exception 
	{ 
		int c; 
		URL u = new URL("https://mrcet.com/downloads/digital_notes/IT/JAVA%20PROGRAMMING.pdf"); 
		URLConnection uc = u.openConnection(); 
		System.out.println("Date: " + new Date(uc.getDate())); 
		System.out.println("Content-Type: " + uc.getContentType()); 
		System.out.println("Expires: " + uc.getExpiration()); 
		System.out.println("Last-Modified: " + new Date(uc.getLastModified())); 
		int len = uc.getContentLength(); 
		System.out.println("Content-Length: " + len); 
		if (len > 0) 
		{ 
			FileOutputStream fout = new FileOutputStream("test.pdf");
			System.out.println("=== Content ==="); 
			InputStream input = uc.getInputStream(); 
			int i = 0; 
			while (((c = input.read()) != -1) && i < len) 
			{ 
				fout.write((char)c);
				//System.out.print((char) c); 
				i++;
			} 
			input.close(); 
			fout.close();
		}
		else 
		{ 
			System.out.println("No Content Available"); 
		} 
	} 
}