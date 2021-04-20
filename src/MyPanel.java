import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{
    /***********Параметры Panel***********/
    Timer timer;
    int PANEL_WIDTH = 1440;
    int PANEL_HEIGHT = 810;
    Circle circle = new Circle();

    /**********Параметры инструкций**************/
    int k = 0;
    int instruction = 0;
    Instruction[] instr_arr = new Instruction[9];
    InstructionsHandler instructionsHandler = new InstructionsHandler(PANEL_WIDTH, PANEL_HEIGHT);

    /**********Настройка окна**************/
    MyPanel()
    {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        timer = new Timer(50, this);
        timer.start();
    }

    /**********Отрисовка фигуры**************/
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(10));
        g2D.setPaint(Color.red);
        g2D.fillOval((int)(circle.getX() - circle.getRadius()), (int)(circle.getY() - circle.getRadius()), (int)(circle.getRadius() * 2), (int)(circle.getRadius() * 2));
    }

    /**************Методы инстукций***************/
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

    /**************Выполнение тика и перерисовка фигуры*******************/
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (!circle.isMoving())
        {
            //System.out.println("||");
            if (instruction > 0)
            {
                if (instructionsHandler.execInstruction(circle, instr_arr, instruction))
                {
                    instruction = 0;
                }
                if (instruction > 0)
                    circle.printParams();
            }
        }
        circle.tick();
        repaint();
    }
}
