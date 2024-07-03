

import java.awt.*;
import java.awt.event.*;

class Si extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1;
	TextArea ta1,ta2;
	Button b1,b2;
	Choice ch1;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cg;

	Si()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		l1=new Label("Enter name:");
		l2=new Label("Address:");
		l3=new Label("Gender:");
		l4=new Label("Hobbies:");
		l5=new Label("Class:");
		l6=new Label("Display:");

		t1=new TextField(10);
		ta1=new TextArea(3,20);
		ta1=new TextArea(5,20);

		cg=new CheckboxGroup();
		c1=new Checkbox("Male",cg,true);
		c2=new Checkbox("Female",cg,false);

		c3=new Checkbox("Chatting");
		c4=new Checkbox("Tik Tok");
		c5=new Checkbox("pubggg");
		ch1=new Choice();
		ch1.add("BCS");
		ch1.add("Msc");
		ch1.add("Bcs");
		
		b1=new Button("Add");
		b2=new Button("Clear");

		add(l1);
		add(t1);
		add(l2);
		add(ta1);
		add(l3);
		add(c1);
		add(c2);
		add(l4);
		add(c3);
		add(c4);
		add(c5);
		add(l5);
		add(ch1);
		add(l6);
		add(ta2);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String name=t1.getText();
			String add=ta1.getText();
			String gender="";

			if(c1.getState()==true)
			  gender="Male";
			if(c2.getState()==true)
			 gender="Femail";
		
			String hb="";
			if(c3.getState()==true)
			 hb="Chatting";
			if(c4.getState()==true)
			 hb=hb+"Tik-Tok";
			if(c5.getState()==true)
			 hb=hb+"Pubg";
			String cls=ch1.getSelectedItem();
		
			ta2.append("Name="+name);
			ta2.append("\nAdderes="+add);
			ta2.append("\nGender="+gender);
			ta2.append("\nHobbies="+hb);
			ta2.append("\nClass="+cls);
		}
		if(ae.getSource()==b2)
		{
			t1.setText("");
			ta1.setText("");
			c1.setState(false);
			c2.setState(false);
			c3.setState(false);
			c4.setState(false);
			c5.setState(false);
			ta2.setText("");
		}
	}
		public static void main(String abc[])
		{
			new Si();
		}

}