import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{
    /***********Параметры Panel***********/
    Timer timer;
    int PANEL_WIDTH = 1440;
    int PANEL_HEIGHT = 810;

    /**********Объект круг**************/
    Circle circle = new Circle();

    /**********Обработчик инструкций**************/
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

    /**************Выполнение тика и перерисовка фигуры*******************/
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (!circle.isMoving())
        {
            //System.out.println("||");
            if (instructionsHandler.getIstruction() > 0)
            {
                if (instructionsHandler.execInstruction(circle))
                {
                    instructionsHandler.setInstruction(0);
                }
                if (instructionsHandler.getIstruction() > 0)
                    circle.printParams();
            }
        }
        circle.tick();
        repaint();
    }
}
