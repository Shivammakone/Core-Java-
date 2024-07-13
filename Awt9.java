
import java.awt.*;
import java.awt.event.*;

class Bi extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup cg1,cg2;

	Bi()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		cg1=new CheckboxGroup();
		cg2=new CheckboxGroup();

		c1=new Checkbox("BCA",cg1,false);
		c2=new Checkbox("BCS",cg1,false);
		c3=new Checkbox("B_Com",cg1,false);
		c4=new Checkbox("M_Com",cg2,false);
		c5=new Checkbox("MCA",cg2,false);
		c6=new Checkbox("MCS",cg2,false);
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(3,1));
		p1.add(c1);p1.add(c2);p1.add(c3);
	
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(3,1));
		p2.add(c4);p2.add(c5);p2.add(c6);

		Panel p3=new Panel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(p1);p3.add(p2);
		add(p3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState()==true)
		  c5.setState(true);
		if(c2.getState()==true)
		  c6.setState(true);
		if(c3.getState()==true)
		  c4.setState(true);

	}
	public static void main(String abc[])
	{
		new Bi();
	}
}