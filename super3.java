class A
{
	A(int x,int y)
	{
		int c=x+y;
		System.out.println("Addition in A="+c);
	}
}

class B extends A
{
	B(int x,int y)
	{
		super(x,y);
		int c=x+y;
		System.out.println("Addition in B="+c);
	}
}

class MFS
{
	public static void main(String abc[])
	{
		B ob=new B(11,22);
	}
}