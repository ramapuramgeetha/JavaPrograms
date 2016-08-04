/* Euclidean Distance formula  
	dist((x, y), (a, b)) = sqrt((x - a)² + (y - b)²)
here (x,y and (0,0)
 therefore dist = sqrt [(x^2)+(y^2)]
*/
public class EuclideanFormula
{
	public static void main (String args[])
	{
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double dist = Math.sqrt (x*x +y*y);
		System.out.println ("The distance is "+ dist);
	}
}