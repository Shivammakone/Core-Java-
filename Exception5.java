//NullPointerException error...

class Bhamta
{
	public static void main(String arg[])
	{
		try
		{
			String s1=null;
			System.out.println("Length="+s1.length());
		}
		catch(Exception e)
		{
			System.out.println("Error ali print keli"+e);
		}
	}
}