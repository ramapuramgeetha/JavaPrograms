/* Find the area of a rectangle and Circle using Polymorphism */

class Area
{
	public Area (int Breadth, int Length)
	{
		System.out.println ("Area of a Rectangle - Length : " + Length + "Breadth: "+ Breadth + " = " +(Breadth*Length));
	}
	public Area (float Radius)
	{
		System.out.println ("Area of a Circle - Radius : " + Radius +"=" + (3.14f*Radius*Radius));
	}

}

class FindArea
{
	public static void main (String args[])
	{
		int Length = Integer.parseInt(args[0]);
		int Breadth = Integer.parseInt(args[1]);
		float Radius = Float.parseFloat (args[2]);
		new Area (Length,Breadth);
		new Area (Radius);
	}
}
	