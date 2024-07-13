import java.util.*;
class EvenorOdd
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number to check:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}