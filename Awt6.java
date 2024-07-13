
import java.awt.*;
import java.awt.event.*;

class Delo extends Frame implements ActionListener
{
	
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	

	Delo()
	{
		setVisible(true);
		setSize(500,400);
		setTitle("Addition Program");
		setBackground(Color.pink);
		setLocation(100,300);
		setLayout(new GridLayout(5,2,0,0));

		l1=new Label("Enter no1:");
		l2=new Label("Enter no2:");
		l3=new Label("Result:");

		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);

		b1=new Button("Addition");
		b2=new Button("sub");
		b3=new Button("clear");
		b4=new Button("Exit");

		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		add(b3);add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2 /*  t2.getText()  */);
			int c=a+b;
			t3.setText(""+c);
			
		}
		if(ae.getSource()==b2)
		{
			
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			t3.setText(""+c);
			
		}
		if(ae.getSource()==b3)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(ae.getSource()==b4)
		{
			dispose();
		}

	}
	public static void main(String abc[])
	{
		Delo ob=new Delo();
	}
}