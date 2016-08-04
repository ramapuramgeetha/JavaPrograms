/* Find the area of a rectangle and Circle using Polymorphism */

class AreaCalculation
{
	public int Area (int Breadth, int Length)
	{
		return (Breadth*Length);
	}
	public float Area (float Radius)
	{
		return (3.14f*Radius*Radius);
	}

}

class FindArea
{
	public static void main (String args[])
	{
		int Length = Integer.parseInt(args[0]);
		int Breadth = Integer.parseInt(args[1]);
		System.out.println ("Area of a Rectangle - Length : " + Length + "Breadth: "+ Breadth + " = " +new AreaCalculation().Area(Breadth,Length));
		float Radius = Float.parseFloat (args[2]);
		System.out.println ("Area of a Circle - Radius : " + Radius +"=" + new AreaCalculation().Area(Radius));
	}
}
	