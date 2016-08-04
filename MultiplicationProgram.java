/* To print the multiplication table of a given number 
*/

import java.util.Scanner;
class Multiplication 
{
public void table (int Number)
{
	for (int Counter=1; Counter<=10; Counter ++)
	{
		System.out.println (Number + " * " + Counter + " = " + (Number*Counter)); 
	} 
}
}



class MultiplicationProgram
{

	public static void main (String args[])
	{
		Scanner UserInput =new Scanner(System.in);
		//String Tablenumberstr = new String();
		int TableNumber;	
		System.out.print("Enter the number: ");
		
		TableNumber = Integer.parseInt (UserInput.next( ));
		//int TableNumber = Integer.parseInt(args[0]);
		Multiplication Obj = new Multiplication ();
		Obj.table (TableNumber);

	}
}