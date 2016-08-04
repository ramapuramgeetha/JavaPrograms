/* PRogram to read and write a file*/
import java.io.*;
class FileHandling
{
	public static void main (String args[])
	{
		// first we write into the file
		try {
		FileOutputStream fout= new FileOutputStream ("testfile.txt");
		String s="I have a new string";
		byte b[]=s.getBytes ();
		fout.write (b);
		fout.close();
		System.out.println ("Success");
		} catch (Exception e) { System.out.println (e);}
		
		// now we read it
		try {
		FileInputStream fin = new FileInputStream ("testfile.txt");
		int i=0;
		String outString="";
		while ((i=fin.read()) != -1)
		{
			outString = outString +((char)i);
			
		} 
		System.out.println (outString);
		fin.close();
		System.out.println ("Success");
		} catch (Exception e) { System.out.println (e);}
	}
}