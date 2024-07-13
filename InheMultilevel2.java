// Multilevel inheritance example
import java.util.*;
class Grandfather
{
	String gname;
	Scanner sc=new Scanner(System.in);
	void acceptg()
	{
		System.out.println("Enter Grandfather name:");
		gname=sc.next();
	} 
}

class Father extends Grandfather 
{
	String fname;
	
	void acceptf()
	{
		System.out.println("Enter father name:");
		fname=sc.next();
	} 
}

class Child extends Father
{
	String cname;
	
	void accepts()
	{
		System.out.println("Enter Child name:");
		cname=sc.next();
	}
	void disp()
	{
		System.out.println("Grandfather name="+gname);
		System.out.println("Father name:"+fname);
		System.out.println("Child name:"+cname);
	} 
}

class MD
{
	public static void main(String abc[])
	{
		Child ob=new Child();
		ob.acceptg();
		ob.acceptf();
		ob.accepts();
		ob.disp();
	}
}



