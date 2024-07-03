class A
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition1="+c);
	}
}

class B extends A
{
	void add(int a,int b)
	{
		super.add(a,b);
		int c=a+b;
		System.out.println("Addition2="+c);
	}
}

class MDD
{
	public static void main(String abc[])
	{
		B ob=new B();
		ob.add(11,22);
	}
}