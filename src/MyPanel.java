import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener
{
    /***********Параметры Panel***********/
    Timer timer;
    int PANEL_WIDTH = 1280;
    int PANEL_HEIGHT = 1024;

    /**********Объект круг**************/
    Circle figure;


    /**********Обработчик инструкций**************/
    InstructionsHandler instructionsHandler = new InstructionsHandler(PANEL_WIDTH, PANEL_HEIGHT);

    /**********Настройка окна**************/
    MyPanel()
    {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        timer = new Timer(50, this);
        timer.start();
        figure = new Circle();
    }

    /**********Отрисовка фигуры**************/
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(10));
        g2D.setPaint(Color.red);
        g2D.fillOval((int)(figure.getX() - figure.getRadius()), (int)(figure.getY() - figure.getRadius()), (int)(figure.getRadius() * 2), (int)(figure.getRadius() * 2));
    }

    /**************Выполнение тика и перерисовка фигуры*******************/
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (!figure.isMoving())
        {
            //System.out.println("||");
            if (instructionsHandler.getIstruction() > 0)
            {
                if (instructionsHandler.execInstruction(figure))
                {
                    instructionsHandler.setInstruction(0);
                }
                //if (instructionsHandler.getIstruction() > 0)
                // figure.printParams();
            }
        }
        figure.tick();
        repaint();
    }

}
