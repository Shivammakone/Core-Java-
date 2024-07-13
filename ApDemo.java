import java.applet.Applet;
import java.awt.*;

public class ApDemo extends Applet {
    @Override
    public void paint(Graphics g) {
        Font f1 = new Font("Arial", Font.BOLD, 25);
        g.setFont(f1);
        g.drawString("Welcome to BBCa BCS TY", 50, 50);

        g.drawArc(100, 100, 200, 200, 90, 180);
    }
}
