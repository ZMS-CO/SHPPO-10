import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{

    Timer timer;
    double alphaGrad = 5;
    double alpha = Math.toRadians(alphaGrad);
    double h = 400;
    int PANEL_WIDTH = 1200;
    int PANEL_HEIGHT = 675;
    double x = 300;
    double y = 300;
    double r = 100;
    int xVelocity = 5;
    int yVelocity = 5;
    int rVelocity = 0;
    double x1 = x;
    double x2 = x1 + (Math.cos(alpha)*h);
    double y1 = y;
    double y2 = y1 + (Math.sin(alpha)*h);
    public double dH = 1;
    public double x3 = x1 + (Math.cos(alpha)*dH);
    public double y3 = x1 + (Math.sin(alpha)*dH);
    int k = 0;
    int xDestination = 0;
    int yDestination = 0;

    int instruction = 0;
    Instruction[] instr_arr = new Instruction[9];



    MyPanel()
    {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        timer = new Timer(50, this);
        timer.start();
        /*
        for (int i = 0; i < 9; i++)
        {
            instr_arr[i] = 0;
        }

         */
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(10));
        g2D.setPaint(Color.red);
        g2D.fillOval((int)(x - r), (int)(y - r), (int)(r * 2), (int)(r * 2));
        //g2D.setPaint(Color.yellow);
        //g2D.drawLine((int)(x1), (int)(y1), (int)(x2) , (int)(y2));
        //g2D.setPaint(Color.green);
        //g2D.fillOval((int)(x3 - r), (int)(y3 - r), (int)(r * 2), (int)(r * 2));

    }

    public void setInstruction(int instr)
    {
        this.instruction = instr;
        //System.out.println(instr);
    }

    public void addInstruction(Instruction instr)
    {
        instr_arr[k++] = instr;
    }

    public void printInstructions()
    {
        for (int i = 0; i < k; i++)
        {
            instr_arr[i].printParameters();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        /*
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
        x3 = x1 + (Math.cos(alpha)*dH);
        y3 = x1 + (Math.sin(alpha)*dH);
        if(dH<h)
        {
            dH++;
        }

        */

        if (k > 0)
        {
            if (instruction <= k && instruction > 0)
            {
                x = x + (int)(Math.cos(Math.toRadians(instr_arr[instruction - 1].getAlpha())) * instr_arr[instruction - 1].getH());
                y = y + (int)(Math.sin(Math.toRadians(instr_arr[instruction - 1].getAlpha())) * instr_arr[instruction - 1].getH());
                r = r + instr_arr[instruction - 1].getDr();
            }
        }

        if (instruction == 10 && y - r > 4)
        {
            y = y - yVelocity;
        }
        if (instruction == 11 && y + r < PANEL_HEIGHT - 4)
        {
            y = y + yVelocity;
        }
        if (instruction == 12 && x - r > 4)
        {
            x = x - xVelocity;
        }
        if (instruction == 13 && x + r < PANEL_WIDTH - 4)
        {
            x = x + xVelocity;
        }
        repaint();
    }
}
