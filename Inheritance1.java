// practice 2:inheritance


class B 
{
	B()
	{
		System.out.println("hi...from class B");
	}
}


class A extends B
{
	A()
	{
		System.out.println("hi ..from class A");
	}
}

class Head
{
	public static void main(String abc[])
	{
		A ob=new A();
	}	
}