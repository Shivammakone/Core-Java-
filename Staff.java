/*
import java.util.*;
abstract class Staff
{
	String name,add;
	abstract void disp();
}

class FulltimeStaff extends Staff
{
	String dept;
	int sal;
	FulltimeStaff(String name,String add,String dept,int sal)
	{
		this.name=name;
		this.add=add;
		this.dept=dept;
		this.sal=sal;
	}
	void disp()
	{
		System.out.println("Staff Name="+name);
		System.out.println("Staff Addres="+add);
		System.out.println("Staff department="+dept);
		System.out.println("Staff Salary="+sal);
	}
}

class PartTimeStaff extends Staff
{
	String dept;
	int sal;
	PartTimeStaff(String name,String add,int hours,int rate)
	{
		this.name=name;
		this.add=add;
		this.hours=hours;
		this.rate=rate;
	}
	void disp()
	{
		System.out.println("Staff Name="+name);
		System.out.println("Staff Addres="+add);
		System.out.println("Staff Hours="+hours);
		System.out.println("Staff rate per hours="+rate);
		System.out.println("Salary="+(hours*rate));
	}
}

class BFD
{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();

		FulltimeStaff ob[]=new FulltimeStaff[n];
		PartTimeStaff ob[]=new PartTimeStaff[n];
		int ch;
		do
		{
			System.out.println("Enter Choice \n 1-Full Time \n 2-Part Time");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:for(int i=0;i<n;i++)
					{
					System.out.println("Enter name:");
					String name=sc.next();
					System.out.println("Enter address:");
					String add=sc.next();
					System.out.println("Enter Dept:");
					String dept=sc.next();
					System.out.println("Enter sal:");
					int sal=sc.nextInt();
					ob[i]=new FulltimeStaff(name,add,dept,sal);
					}
				for(int i=0;i<n;i++)
				{
					ob[i].disp();
				}
				break;
				case 2:for(int i=0;i<n;i++)
					{
					System.out.println("Enter name:");
					String name=sc.next();
					System.out.println("Enter address:");
					String add=sc.next();
					System.out.println("Enter Number of hours:");
					int hours=sc.nextInt();
					System.out.println("Enter rate per hour:");
					int rate=sc.nextInt();
					ob[i]=new PartTimeStaff(name,add,dept,sal);
					}
				for(int i=0;i<n;i++)
				{
					ob[i].disp();
				}
				break;
			}//Switch
		}while(ch<3);
	}
}   */


import java.util.*;

abstract class Staff {
    String name, add;
    abstract void disp();
}

class FulltimeStaff extends Staff {
    String dept;
    int sal;

    FulltimeStaff(String name, String add, String dept, int sal) {
        this.name = name;
        this.add = add;
        this.dept = dept;
        this.sal = sal;
    }

    void disp() {
        System.out.println("Staff Name = " + name);
        System.out.println("Staff Address = " + add);
        System.out.println("Staff Department = " + dept);
        System.out.println("Staff Salary = " + sal);
    }
}

class PartTimeStaff extends Staff {
    int hours, rate;

    PartTimeStaff(String name, String add, int hours, int rate) {
        this.name = name;
        this.add = add;
        this.hours = hours;
        this.rate = rate;
    }

    void disp() {
        System.out.println("Staff Name = " + name);
        System.out.println("Staff Address = " + add);
        System.out.println("Staff Hours = " + hours);
        System.out.println("Staff Rate per Hour = " + rate);
        System.out.println("Salary = " + (hours * rate));
    }
}

class BFD 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        FulltimeStaff[] fullTimeStaffArray = new FulltimeStaff[n];
        PartTimeStaff[] partTimeStaffArray = new PartTimeStaff[n];

        int ch;
        do {
            System.out.println("Enter Choice \n1 - Full Time \n2 - Part Time \n3 - Exit");
            ch = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (ch) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter address:");
                        String add = sc.nextLine();
                        System.out.println("Enter Dept:");
                        String dept = sc.nextLine();
                        System.out.println("Enter sal:");
                        int sal = sc.nextInt();
                        sc.nextLine();  // Consume newline
                        fullTimeStaffArray[i] = new FulltimeStaff(name, add, dept, sal);
                    }
                    for (int i = 0; i < n; i++) {
                        fullTimeStaffArray[i].disp();
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter address:");
                        String add = sc.nextLine();
                        System.out.println("Enter Number of hours:");
                        int hours = sc.nextInt();
                        System.out.println("Enter rate per hour:");
                        int rate = sc.nextInt();
                        sc.nextLine();  // Consume newline
                        partTimeStaffArray[i] = new PartTimeStaff(name, add, hours, rate);
                    }
                    for (int i = 0; i < n; i++) {
                        partTimeStaffArray[i].disp();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (ch != 3);
        sc.close();
    }
}
