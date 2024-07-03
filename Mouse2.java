
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame 
{
	TextField t1;
	FDemo()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		t1=new TextField(20);
		add(t1);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
			t1.setText("x pos="+me.getX()+"\t y pos="+me.getY());
			}
		} );
	}
	public static void main(String abc[])
	{
		new FDemo();
	}
}
/*

import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame 
{
    TextField t1;

    FDemo() 
    {
        setVisible(true);
        setSize(500, 600);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        add(t1);
        addMouseListener(new MouseAdapter() 
	{
            public void mouseClicked(MouseEvent me) 
	    {
                t1.setText("x pos=" + me.getX() + "\t y pos=" + me.getY());
            }
        });
    }

    public static void main(String abc[]) 
    {
        new FDemo();
    }
}
*/