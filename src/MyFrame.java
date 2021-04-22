import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener
{
    MyPanel panel;
    /*********Создание панели и первоначальная настройка********/
    MyFrame()
    {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    /*********Привязка клавиш к вызову инструкции********/
    @Override
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_1:
                {panel.instructionsHandler.setInstruction(1); break;}
            case KeyEvent.VK_2:
                {panel.instructionsHandler.setInstruction(2); break;}
            case KeyEvent.VK_3:
                {panel.instructionsHandler.setInstruction(3); break;}
            case KeyEvent.VK_4:
                {panel.instructionsHandler.setInstruction(4); break;}
            case KeyEvent.VK_5:
                {panel.instructionsHandler.setInstruction(5); break;}
            case KeyEvent.VK_6:
                {panel.instructionsHandler.setInstruction(6); break;}
            case KeyEvent.VK_7:
                {panel.instructionsHandler.setInstruction(7); break;}
            case KeyEvent.VK_8:
                {panel.instructionsHandler.setInstruction(8); break;}
            case KeyEvent.VK_9:
                {panel.instructionsHandler.setInstruction(9); break;}
            case KeyEvent.VK_SPACE:
                {panel.instructionsHandler.setInstruction(0); break;}
            case KeyEvent.VK_UP:
                {panel.instructionsHandler.setInstruction(10); break;}
            case KeyEvent.VK_DOWN:
                {panel.instructionsHandler.setInstruction(11); break;}
            case KeyEvent.VK_LEFT:
                {panel.instructionsHandler.setInstruction(12); break;}
            case KeyEvent.VK_RIGHT:
                {panel.instructionsHandler.setInstruction(13); break;}
        }

    }

    /************Клавиша отжата**************/
    @Override
    public void keyReleased(KeyEvent e)
    {
        //System.out.println(e.getKeyCode() + " -\t" + e.getKeyChar());
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_UP, KeyEvent.VK_RIGHT, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT ->
                panel.instructionsHandler.setInstruction(0);
        }

    }

}