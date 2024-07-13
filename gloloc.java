//This program shows the use how to use local,goble and super variabel
class A
{
	int x=55;  //basic class member
}

class B extends A
{
	int x=44;
	void disp()
	{
		int x=33;  //Local
		System.out.println("Value1="+x);
		System.out.println("Value2="+this.x);
		System.out.println("Value3="+super.x);
	}
}

class MD
{
	public static void main(String abc[])
	{
		B ob=new B();
		ob.disp();
	}
}