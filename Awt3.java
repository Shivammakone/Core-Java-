

import java.awt.*;
class Le extends Frame
{
	Label f1;
	Checkbox c1,c2,c3,c4,c5;
	Button b1,b2,b3;
	Le()
	{
		setVisible(true);
		setSize(500,400);

		setTitle("Addition program");
		setBackground(Color.orange);
		setLocation(800,400);
		setLayout(new GridLayout(7,2));
		c1=new Checkbox("Java");
		c2=new Checkbox("PHP");
		c3=new Checkbox("Tcs");
		c4=new Checkbox("Python");
		c5=new Checkbox("DS");
		f1=new Label("Select Subject:");
		b1=new Button("Submit");
		add(f1);add(c1);add(c2);add(c3);add(c4);add(c5);add(b1);
	}
	public static void main(String abc[])
	{
		Le ob=new Le();
		
	}
}