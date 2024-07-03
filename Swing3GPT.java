import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ti1 extends Frame implements AdjustmentListener {
    JScrollBar j1, j2, j3;

    Ti1() {
        setVisible(true);
        setSize(500, 500);
        setLayout(null);

        j1 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        j1.setBounds(100, 100, 300, 30);
        add(j1);

        j2 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        j2.setBounds(100, 150, 300, 30);
        add(j2);

        j3 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        j3.setBounds(100, 200, 300, 30);
        add(j3);

        j1.addAdjustmentListener(this);
        j2.addAdjustmentListener(this);
        j3.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae) {
        int r = j1.getValue();
        int g = j2.getValue();
        int b = j3.getValue();
        Color c1 = new Color(r, g, b);
        setBackground(c1);
    }

    public static void main(String[] args) {
        new Ti1();
    }
}
