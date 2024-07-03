//This code accept the values from user and display
import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	int id,sal;
	String name,dept;
	Employee()
	{
		id=101;
		name="om";
		dept="computer";
		sal=56677;
	}
	Employee(int id,String name,String dept,int sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	void accept()
	{
		System.out.println("Enter id name dept sal:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		sal=sc.nextInt();	
	}
	void disp()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Department="+dept);
		System.out.println("Salary="+sal);
	}
}

class Manager extends Employee
{
	int bonus;
	Manager()
	{
		bonus=3000;
	}
	Manager(int bouns)
	{
		this.bonus=bonus;
	}
	void acceptm()
	{
		System.out.println("Enter bonus:");
		bonus=sc.nextInt();
	}
	void dispm()
	{
		System.out.println("Bonus="+bonus);
	}
}

class MFS
{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=sc.nextInt();
		Manager ob[]=new Manager[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new Manager();
			ob[i].accept();
			ob[i].acceptm();
		}
		int max=ob[0].sal+ob[0].bonus;
		int index=0;
		for(int i=1;i<n;i++)
		{
			if((ob[i].sal+ob[i].bonus)>max)
			{
				max=ob[i].sal+ob[i].bonus;
				index=i;
			}
			ob[index].disp();
			ob[index].dispm();
		}
	}
}
