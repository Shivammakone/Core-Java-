// Multilevel inheritance example
import java.util.*;
class Continent
{
	String cname;
	Scanner sc=new Scanner(System.in);
	void acceptcon()
	{
		System.out.println("Enter continent name:");
		cname=sc.next();
	} 
}

class Country extends Continent 
{
	String coname;
	
	void acceptcan()
	{
		System.out.println("Enter country name:");
		coname=sc.next();
	} 
}

class State extends Country
{
	String Sname,place;
	
	void accepts()
	{
		System.out.println("Enter State name:");
		Sname=sc.next();
		System.out.println("Enter place name:");
		place=sc.next();
	}
	void disp()
	{
		System.out.println("Continent name="+cname);
		System.out.println("Country name:"+coname);
		System.out.println("State name:"+Sname);
		System.out.println("Plase name:"+place);
		
	} 
}

class MD
{
	public static void main(String abc[])
	{
		State ob=new State();
		ob.acceptcon();
		ob.acceptcan();
		ob.accepts();
		ob.disp();
	}
}



