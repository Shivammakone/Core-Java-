//Example of command line argument
class par3
{
	public static void main(String arg[])
	{
		int eno=Integer.parseInt(arg[0]);
		String name=arg[1];
		float sal=Float.parseFloat(arg[2]);
		

		System.out.println("Employ number="+eno);
		System.out.println("Employ name="+name);
		System.out.println("Employ salary="+sal);
	}
}