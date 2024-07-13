

import java.awt.*;
class Le extends Frame
{
	Label f1,f2;
	TextField t1;
	List la;
	Button b1,b2,b3;
	Le()
	{
		setVisible(true);
		setSize(500,400);
		setTitle("Addition program");
		setBackground(Color.orange);
		setLocation(800,400);
		setLayout(new FlowLayout());
		f1=new Label("Enter Product:");
		f2=new Label("All product:");
		t1=new TextField(10);
		la=new List(10);
		b1=new Button("Jay");
		b2=new Button("Shri");
		b3=new Button("Rama");
		add(f1);add(t1);add(f2);add(la);add(b1);add(b2);add(b3);
	}
	public static void main(String abc[])
	{
		Le ob=new Le();
		
	}
}