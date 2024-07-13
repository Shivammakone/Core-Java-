class Fe
{
	public static void main(String abc[])
		{
			int b=0,c=0,d=0,e1=0;
			try
			{
				int a=10;
				b=a+5;
				c=a-5;
				d=a/0;
				e1=a*5;
			}
			finally
			{
				System.out.println("Addition="+b);		
				System.out.println("Sub="+c);
				System.out.println("Div="+d);	
				System.out.println("Multi="+e1);
			}
		}
}
