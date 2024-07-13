

import java.awt.*;
class Le extends Frame
{
	Label f1;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cg;
	Button b1,b2,b3;
	Le()
	{
		setVisible(true);
		setSize(500,400);

		setTitle("Addition program");
		setBackground(Color.orange);
		setLocation(800,400);
		f1=new Label("Select Country");
		setLayout(new FlowLayout());
		cg=new CheckboxGroup();
		c1=new Checkbox("Indian",cg,true);
		c2=new Checkbox("Foragin",cg,false);
		
		b1=new Button("Submit");
		add(f1);add(c1);add(c2);add(b1);
	}
	public static void main(String abc[])
	{
		Le ob=new Le();
		
	}
}