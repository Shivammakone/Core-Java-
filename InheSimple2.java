//practice of Inheratance

class A
{
	int x,y,z;
	A()
	{
		x=11;
		System.out.println("I am base A");
	}
}

class B extends A
{
	B()
	{
		y=44;
		System.out.println("I am base B");
	}
}

class C extends B
{
	C()
	{
		z=88;
		System.out.println("I am base c");
	}
}

class MD
{
	public static void main(String abc[])
	{
		C ob=new C();
		//ob.C();
	}
}