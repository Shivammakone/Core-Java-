

import java.awt.*;
class Le extends Frame
{
	Label f1,f2;
	TextField t1;
	List la1,l2;
	Button b1,b2,b3;
	Le()
	{
		setVisible(true);
		setSize(500,400);
		setTitle("Addition program");
		setBackground(Color.red);
		setLocation(800,400);
		setLayout(new FlowLayout());
		f1=new Label("Enter Product:");
		f2=new Label("All product:");
		l2=new List(20);
		la1=new List(10);
		b1=new Button("Jay");
		b2=new Button("Shri");
		b3=new Button("Rama");
		add(f1);add(l2);add(f2);add(la1);add(b1);add(b2);add(b3);
	}
	public static void main(String abc[])
	{
		Le ob=new Le();
		
	}
}