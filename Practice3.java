// Uses of overloading
class Prac
{
	
	void Sub(int a,int b)
	{
		int s=a-b;
		System.out.println("Substraction="+s);
	}
	void Sub(int a,int b,int c)
	{
		int s1=a-b;
		int s=s1-c;
		System.out.println("Substraction="+s);
	}
	
	public static void main(String arg[])
	{
		Prac ob=new Prac();
		
		ob.Sub(23,56);
		ob.Sub(33,66,55);
	}
}