/* Sum of 2 dice
	generate a random number using the random method
	multiply it by 10 and take the rounded value (since random (double a) give random numbers between 0 and 1)
	make sure it is between 1 and 6
	repeat for second random number
	add the two random numbers
*/
public class SumOfDice
{
	public static void main (String args[])
	{
		long Random1=0; 
		long Random2=0;
		while (Random1==0 || Random1 >6)
		{
			Random1 = Math.round(Math.random()*10);
			System.out.println ("Dice 1 no bounds is "+ Random1);
		}
		//System.out.println ("Dice 1 is "+ Random1);
		;
		while (Random2==0 || Random2 >6)
		{
			Random2 = Math.round(Math.random()*10);
			System.out.println ("Dice 2 no bounds is "+ Random2);
		}
		
		System.out.println ("Dice 1 is "+ Random1);
		System.out.println ("Dice 2 is "+ Random2);
		long Sum = Random1+Random2;
		System.out.println ("The sum of the dice is "+ Sum);
	}
}