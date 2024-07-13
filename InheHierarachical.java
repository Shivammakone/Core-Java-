// example of Hierarachical
import java.util.*;
class College
{
	int cno;
	String cname,add;
	
	Scanner sc=new Scanner(System.in);
	void acceptc()
	{
		System.out.println("Enter college no:");
		cno=sc.nextInt();
		System.out.println("Enter college name:");
		cname=sc.next();
		System.out.println("Enter college Addres:");
		add=sc.next();
	}
	void dispc()
	{
		System.out.println("College no="+cno);
		System.out.println("College name="+cname);
		System.out.println("College Addres="+add);
	}
}

class Student extends College
{
	int sno;
	String sname;
	float per;
	
	
	void accepts()
	{
		System.out.println("Enter student no:");
		sno=sc.nextInt();
		System.out.println("Enter student name:");
		sname=sc.next();
		System.out.println("Enter student percentage:");
		per=sc.nextFloat();
	}
	void disps()
	{
		System.out.println("student no="+sno);
		System.out.println("student name="+sname);
		System.out.println("student percentage="+per);
	}
}

class Teacher extends College
{
	int tno;
	String tname;
	float sal;
	
	void acceptt()
	{
		System.out.println("Enter teacher no:");
		tno=sc.nextInt();
		System.out.println("Enter teacher name:");
		tname=sc.next();
		System.out.println("Enter teacher salary:");
		sal=sc.nextFloat();
	}
	void dispt()
	{
		System.out.println("teacher no="+tno);
		System.out.println("teacher name="+tname);
		System.out.println("teacher salary="+sal);
	}
}

class MD
{
	public static void main(String abc[])
	{
		Student ob=new Student();
		ob.acceptc();
		ob.accepts();
		Teacher ob1=new Teacher();
		ob1.acceptt();
		ob.dispc();
		ob.disps();
		ob1.dispt();
	}
} 


/* import java.util.*;

class College {
    int cno;
    String cname, add;

    Scanner sc = new Scanner(System.in);

    void acceptc() {
        System.out.println("Enter college no:");
        cno = sc.nextInt();
        System.out.println("Enter college name:");
        cname = sc.next();
        System.out.println("Enter college Addres:");
        add = sc.next();
    }

    void dispc() {
        System.out.println("College no=" + cno);
        System.out.println("College name=" + cname);
        System.out.println("College Addres=" + add);
    }
}

class Student extends College {
    int sno;
    String sname;
    float per;

    void accepts() {
        System.out.println("Enter student no:");
        sno = sc.nextInt();
        System.out.println("Enter student name:");
        sname = sc.next();
        System.out.println("Enter student percentage:");
        per = sc.nextFloat();
    }

    void disps() {
        System.out.println("student no=" + sno);
        System.out.println("student name=" + sname);
        System.out.println("student percentage=" + per);
    }
}

class Teacher extends College {
    int tno;
    String tname;
    float sal;

    void acceptt() {
        System.out.println("Enter teacher no:");
        tno = sc.nextInt();
        System.out.println("Enter teacher name:");
        tname = sc.next();
        System.out.println("Enter teacher salary:");
        sal = sc.nextFloat();
    }

    void dispt() {
        System.out.println("teacher no=" + tno);
        System.out.println("teacher name=" + tname);
        System.out.println("teacher salary=" + sal);
    }
}

class MD {
    public static void main(String abc[]) {
        Student ob = new Student();
        ob.acceptc(); // Call the correct method for Student - acceptc
        ob.accepts();
        ob.dispc();
        ob.disps();

        Teacher ob1 = new Teacher();
        ob1.acceptt();
        ob1.dispt();
    }
} 
*/