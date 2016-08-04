/* Write a program AllEqual.java 
	that takes three integer command-line arguments and 
	prints equal if all three are equal, and not equal otherwise.
*/


public class AllEqual
{
	public static void main (String args[])
	{
	int No1 = Integer.parseInt (args[0]);
	int No2 = Integer.parseInt (args[1]);
	int No3 = Integer.parseInt (args[2]);
	if (No1 == No2 && No2 == No3)
	{
		System.out.println ("Numbers are equal");
		
	}
	else System.out.println ("Numbers are not equal");
	
	}
}