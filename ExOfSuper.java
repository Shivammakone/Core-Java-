
import java.util.*;
class Cylinder
{
	float r,h;
	Scanner sc=new Scanner(System.in);

	void area()
	{
		System.out.println("Enter r and h");
		r=sc.nextFloat();
		h=sc.nextFloat();
		float a=2*3.14f*r*h+2*3.14f*r*r;
		System.out.println("Area of Cylander="+a);
	}
}

class Circle extends Cylinder
{
	float r;
	void area()
	{
		System.out.println("Enter radius");
		r=sc.nextFloat();
		
		float a=3.14f*r*r;
		System.out.println("Area of Circle="+a);
		super.area();
	}
}

class JM
{
	public static void main(String abc[])
	{
		Circle ob=new Circle();
		ob.area();
	}
}

/*

import java.util.Scanner;

class Cylinder {
    float r, h;
    Scanner sc = new Scanner(System.in);

    void area() {
        System.out.println("Enter radius (r) and height (h) of the cylinder:");
        r = sc.nextFloat();
        h = sc.nextFloat();
        float a = 2 * 3.14f * r * h + 2 * 3.14f * r * r;
        System.out.println("Area of Cylinder = " + a);
    }
}

class Circle {
    float r;
    Scanner sc = new Scanner(System.in);

    void area() {
        System.out.println("Enter radius of the circle:");
        r = sc.nextFloat();
        float a = 3.14f * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

class JM {
    public static void main(String abc[]) {
        Circle ob = new Circle();
        ob.area();
    }
}
*/