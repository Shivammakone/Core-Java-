import java.awt.*;
import java.awt.event.*;

class MouseDemo extends Frame implements MouseListener
{
	TextField t1;
	MouseDemo()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		t1=new TextField(50);
		add(t1);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		t1.setText("x pos="+x+"\t y pos="+y);
	}
	public void mouseExited(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
}

class BHJ
{
	public static void main(String abc[])
	{
		new MouseDemo();
	}
}