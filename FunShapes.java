/* Program to learn class manipulation 
1. Create a class shape with n number of points
		- circle ( 2 points, centre and one point)
		-triangle (3 points)
		-rectangle/square (4 points)
2. Write method to draw the shape (can write what shape it is)
3. Write method to get the area of the shape

*/
class Point {
    public int x = 0;
    public int y = 0;
	// a constructor!
    public Point(int a, int b) {
	x = a;
	y = b;
    }
}

//interface Shape{

//public Point x1 = new Point();
//public Point x2 = new Point();
//void shapeType();
//void shapeArea(); 

//}


class Circle //implements Shape
{


	public void shapeType (Point x1, Point x2)
	{
		double radius;
		radius = Math.sqrt(((x2.x-x1.x)*(x2.x-x1.x))+((x2.y-x1.y)*(x2.y-x1.y)));
		System.out.println ("This is a circle with radius:"+ radius); 
	}
	public void shapeArea (Point x1, Point x2)
	{
		double radius;
		double PI= Math.PI;
		double area;
		radius = Math.sqrt(((x2.x-x1.x)*(x2.x-x1.x))+((x2.y-x1.y)*(x2.y-x1.y)));
		area = PI*radius*radius;
		System.out.println ("Area is " + area);
	}

}
class Triangle //implements Shape
{


	public void shapeType (Point x1, Point x2, Point x3)
	{
		double side1;
		double side2;
		double side3;
		side1= Math.sqrt(((x2.x-x1.x)*(x2.x-x1.x))+((x2.y-x1.y)*(x2.y-x1.y)));
		side2= Math.sqrt(((x3.x-x2.x)*(x3.x-x2.x))+((x3.y-x2.y)*(x3.y-x2.y)));
		side3= Math.sqrt(((x3.x-x1.x)*(x3.x-x1.x))+((x3.y-x1.y)*(x3.y-x1.y)));
		System.out.println ("This is a triangle with sides:"+ side1 + "," + side2 + "," + side3); 
	}
	public void shapeArea (Point x1, Point x2,Point x3)
	{
		double side1;
		double side2;
		double side3;
		side1= Math.sqrt(((x2.x-x1.x)*(x2.x-x1.x))+((x2.y-x1.y)*(x2.y-x1.y)));
		side2= Math.sqrt(((x3.x-x2.x)*(x3.x-x2.x))+((x3.y-x2.y)*(x3.y-x2.y)));
		side3= Math.sqrt(((x3.x-x1.x)*(x3.x-x1.x))+((x3.y-x1.y)*(x3.y-x1.y)));
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println ("Area is " + area);
	}

}

public class Funshapes
{
	public static void main (String args[])
	{
	Point FrstPoint = new Point (1,3);
	Point ScndPoint = new Point (-2,-2);
	Point ThrdPoint = new Point (3,-1);
	Circle Crcle = new Circle();
	Crcle.shapeType (FrstPoint,ScndPoint);
	Crcle.shapeType (new Point (1,3),new Point (-2,-2));
	Crcle.shapeArea (FrstPoint,ScndPoint);
	Triangle Trngle = new Triangle();
	Trngle.shapeType (FrstPoint,ScndPoint,ThrdPoint);
	Trngle.shapeArea (FrstPoint,ScndPoint,ThrdPoint);
	
	
	}
}
