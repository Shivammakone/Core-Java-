
import java.appiet.*;
import java.awt.*;

public class ApDemo extends Applet
{
	public void paint(Graphics g)
	{
		Font f1=new Font("Arial",Font.BOLD,25);
		g.setFont(f1);
		g.drawString("Welcome to BBCa BCS TY",100,100);

		g.drawArc(100,100,200,200,90,180);
	}
}


/*
<html>
	<body>
		<applet code="ApDemo" width="500" height="400">
			
		</applet>
	</body>
</html>

*/