//example of Abstract

import java.util.*;
abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
}

class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Enter length and breadth:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float a=b*l;
		System.out.println("Area of rectangle="+a);
	}
}
class Triangle extends Shape
{
	void area()
	{
		System.out.println("Enter base and height:");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		float a=0.5f*b*h;
		System.out.println("Area of rectangle="+a);
	}
}
class MBB
{
	public static void main(String abc[])
	{
		Rectangle ob=new Rectangle();
		ob.area();
		Triangle ob1=new Triangle();
		ob.area();
	}
}