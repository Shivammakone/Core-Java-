
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ki extends JFrame implements AdjustmentListener
{
	JScrollBar j1,j2,j3;
	
	Ki()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new BorderLayout());
		j1=new JScrollBar();
		j1.setOrientation(0);
		j1.setMinimum(0);
		j1.setMaximum(255);

		add(j1,BorderLayout.NORTH);

		j2=new JScrollBar();
		j2.setOrientation(1);
		j2.setMaximum(255);
		j2.setMinimum(0);
	
		add(j2,BorderLayout.EAST);

		j3=new JScrollBar();
		j3.setOrientation(0);
		j3.setMaximum(255);
		j3.setMinimum(0);

		add(j3,BorderLayout.SOUTH);

	j1.addAdjustmentListener(this);
	j2.addAdjustmentListener(this);
	j3.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r=j1.getValue();
		int g=j2.getValue();
		int b=j3.getValue();

		Color c=new Color(r,g,b);
		getContentPane().setBackground(c);
	}

	public static void main(String abc[])
	{
		new Ki();
	}
}