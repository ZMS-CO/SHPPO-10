import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{

    Timer timer;
    int x = 300;
    int y = 300;
    int r = 100;

    MyPanel()
    {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(1200, 675));
        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(10));
        g2D.setPaint(Color.red);
        g2D.drawOval(x - r, y - r, r * 2, r * 2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + 1;
        repaint();
    }



}