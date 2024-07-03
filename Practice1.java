class Prac
{
	int rno;
	String sname;
	float per;
	
	void accept(int rno, String sname, float per)
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	
	void disp()
	{
		System.out.println("Roll no = " + rno);
		System.out.println("Name = " + sname);
		System.out.println("Percentage = " + per);	
	}
	
	public static void main(String arg[])
	{
		Prac ob = new Prac();
		ob.accept(10, "Shiv", 44.55f);
		ob.disp();
	}
}
