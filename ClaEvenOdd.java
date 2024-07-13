// practice 2:Accept number And check even or odd

class CLA4
{
	public static void main(String abc[])
	{
		System.out.println("Even numbers");
		for(int i=0;i<abc.length;i++)
		{
			int a=Integer.parseInt(abc[i]);
			if(a%2==0)
			System.out.println(a+" ");
		}
	}
}