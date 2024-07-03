interface Shape
{
	final float PI=3.14f;
	//float r;
	void area_circle(float r);
	void area_sphere(float r);
}

class Area implements Shape
{
	public void area_circle(float r)
	{
		float a1=PI*r*r;
		System.out.println("Area of circle="+a1);
	}
	public void area_sphere(float r)
	{
		float a=4*PI*r*r;
		System.out.println("Area of sphere="+a);
	}
}

class MBB
{
	public static void main(String abc[])
	{
	Area ob=new Area();
	ob.area_circle(3.5f);
	ob.area_sphere(6.7f);
	}
}