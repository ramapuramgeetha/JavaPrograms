/* Rewrite TenHellos.java to make a program Hellos.java that 
	takes the number of lines to print as a command-line argument. 
	You may assume that the argument is less than 1000. 
	Hint: consider using i % 10 and i % 100 to determine whether to use "st", "nd", "rd", or "th" for printing the ith Hello.
*/

public class TenHellos
{
	public static void main (String args[])
	{
	String suffix;
	int NoOfHellos= Integer.parseInt(args[0]);
	//int NoOfHellos= 30;
	for (int Counter=1;Counter<= NoOfHellos; Counter++)
	{
		if (Counter== 1 || (Counter%10 ==1 && Counter%100 !=11)) suffix ="st";
		else if (Counter== 2 || (Counter%10 ==2 && Counter%100 !=12)) suffix ="nd";
			else if (Counter== 3 || (Counter%10 ==3 && Counter%100 !=13)) suffix ="rd";
				else suffix = "th";
	System.out.println (Counter+suffix+" Hello");
	}
	}
}