import java.util.*;
class Demo
{
	void evenodd(int n)
	{
		if(n%2==0)
		System.out.println("Number is Even");
		else
		System.out.println("Number is Odd");
	}
	void leapyear(int a)
	{
		if(a%4==0)
		System.out.println("Leap Year");
		else
		System.out.println("Not Leap Year.....");
	}
	void square(int s)
	{
		int sq=s*s;
		System.out.println("Square of number="+sq);
	}
	public static void main(String abc[])
	{
		Demo ob;
		ob=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check:");
		int n=sc.nextInt();
		ob.evenodd(n);
		System.out.println("Enter year to check:");
		int a=sc.nextInt();
		ob.leapyear(a);
		System.out.println("Enter number to square:");
		int s=sc.nextInt();
		ob.square(s);
		
	}


}