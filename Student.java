import java.util.*;
class Stu
{
	int sno;
	String sname;
	float pid;

	void accept(int sno1,String sname1,float pid1)
	{
		sno=sno1;
		sname=sname1;
		pid=pid1;
	}
	void disp()
	{
		System.out.println("Student number="+sno);
		System.out.println("Student name="+sname);
		System.out.println("Student percentage="+pid);
	}
	public static void main(String arg[])
	{
		Stu ob=new Stu();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student number:");
		int sno=sc.nextInt();
		System.out.println("Enter student name:");
		String sname=sc.next();
		System.out.println("Enter student percentage:");
		float pid=sc.nextFloat();
		ob.accept(sno,sname,pid);
		ob.disp();
	}
}