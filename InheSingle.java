/*
import java.util.*;
class College
{
	int cno;
	String cname;
	Scanner sc=new Scanner(System.in);


	void accepts()
	{
		System.out.println("Enter collage num");
		cno=sc.nextInt();
		System.out.println("Enter college name");
		cname=sc.next();		
	}	
}
class Student extends College
{
	int srno;
	String sname;
	float per;


	void accepts()
	{
		System.out.println("Enter student Rollno=");
		srno=sc.nextInt();
		System.out.println("Enter student name");
		sname=sc.next();
		System.out.println("Enter student percentage");
		per=sc.nextFloat();		

	}

	void disp()
	{
		System.out.println("collage number="+cno);
		System.out.println("collage name="+cname);
		System.out.println("Student number="+srno);
		System.out.println("Student name="+sname);
		System.out.println("Student Percentage="+per);
	}

	public static void main(String abc[])
	{
		Student ob=new Student();
		ob.acceptc();
		ob.accepts();
		ob.disp();
	} 
} */


import java.util.*;

class College {
    int cno;
    String cname;
    Scanner sc = new Scanner(System.in);

    void acceptCollegeDetails() {
        System.out.println("Enter college number:");
        cno = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.println("Enter college name:");
        cname = sc.nextLine();
    }
}

class Student extends College {
    int srno;
    String sname;
    float per;

    void acceptStudentDetails() {
        System.out.println("Enter student Roll number:");
        srno = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.println("Enter student name:");
        sname = sc.nextLine();
        System.out.println("Enter student percentage:");
        per = sc.nextFloat();
    }

    void displayDetails() {
        System.out.println("College number: " + cno);
        System.out.println("College name: " + cname);
        System.out.println("Student Roll number: " + srno);
        System.out.println("Student name: " + sname);
        System.out.println("Student percentage: " + per);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.acceptCollegeDetails();
        student.acceptStudentDetails();
        student.displayDetails();
    }
}
