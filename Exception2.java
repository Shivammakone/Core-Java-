//NegativeArraySizeException error...

class Palna
{
	public static void main(String arg[])
	{
		try
		{
			int a[]=new int[-5];
			System.out.println("array created succ...");
			a[0]=10;
			a[1]=20;
			a[2]=30;
			System.out.println("Value Insert Succ..");
			System.out.println("Value Disp="+a[1]);
		}
		catch(Exception e)
		{
			System.out.println("Error ali print keli"+e);
		}
	}
}