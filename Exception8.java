class Fem
{
	public static void main(String abc[])
		{
			
			try
			{
				int a[]=new int[-5];
				a[7]=44;
				System.out.println("Array Create");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error="+e);		
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("Error1="+e1);		
			}
			catch(NegativeArraySizeException e2)
			{
				System.out.println("Error2="+e2);		
			}
			catch(Exception e3)
			{
				System.out.println("Error3="+e3);		
			}

		}
}
