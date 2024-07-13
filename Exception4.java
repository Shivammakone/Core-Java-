//StringIndexOutOfBoundsException error...

class Palto
{
	public static void main(String arg[])
	{
		try
		{
			String s1="mauli";
			System.out.println("String"+s1);
			System.out.println("Character="+s1.charAt(7));
		}
		catch(Exception e)
		{
			System.out.println("Error ali print keli"+e);
		}
	}
}