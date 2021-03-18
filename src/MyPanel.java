import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{

    Timer timer;
    int PANEL_WIDTH = 1200;
    int PANEL_HEIGHT = 675;
    int x = 300;
    int y = 300;
    int r = 100;
    int xVelocity = 5;
    int yVelocity = 5;
    int rVelocity = 0;

    MyPanel()
    {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
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
    public void actionPerformed(ActionEvent e)
    {
        if (x + r + 2 >= PANEL_WIDTH || xVelocity < 0 && x - r - 2 <= 0)
        {
            xVelocity = - xVelocity;
        }
        if (y + r + 2 >= PANEL_HEIGHT || yVelocity < 0 && y - r - 2 <= 0)
        {
            yVelocity = - yVelocity;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        r = r + rVelocity;
        repaint();
    }



}