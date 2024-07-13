//NumberFormatException error...

class KG
{
	public static void main(String arg[])
	{
		try
		{
			String s1="10r";
			int n=Integer.parseInt(s1);
			System.out.println("Value="+n);
		}
		catch(Exception e)
		{
			System.out.println("Error ali print keli"+e);
		}
	}
}