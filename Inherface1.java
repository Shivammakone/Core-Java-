//Example of interface

interface I1
{
	void add(int a,int b);
	void square(int n);
}

interface I2
{
	void cube(int n);
}

class Demo implements I1,I2
{
	public void add(int a,int b)
	{
		int ad=a+b;
		System.out.println("Addition="+ad);
	}
	public void square(int n)
	{
		int s=n*n;
		System.out.println("Square="+s);
	}
	public void cube(int n)
	{
		int c=n*n*n;
		System.out.println("Addition="+c);
	}
}

class MD
{
	public static void main(String abc[])
	{
		Demo ob=new Demo();
		ob.cube(5);
		ob.square(4);
		ob.add(3,5);
	}
}