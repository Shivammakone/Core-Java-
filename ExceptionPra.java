//Example of multiple try and catch


class Getlo
{
	public static void main(String arg[])
	{
		try
		{
			String s1="10r";
			int n=Integer.parseInt(s1);
			System.out.println("Value="+n);
	
			int a=5;
			int b=a*a;
			System.out.println("Square="+b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			int a=5;
			int b=a*a;
			System.out.println("Square2="+b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}