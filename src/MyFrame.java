import java.awt.event.*;
import javax.swing.*;



public class MyFrame extends JFrame implements KeyListener
{

    MyPanel panel;
    int instruction = 0;

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

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode() + " -\t" + e.getKeyChar());
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_1:
                instruction = 1;
            case KeyEvent.VK_2:
                instruction = 2;
            case KeyEvent.VK_3:
                instruction = 3;
            case KeyEvent.VK_4:
                instruction = 4;
            case KeyEvent.VK_5:
                instruction = 5;
            case KeyEvent.VK_6:
                instruction = 6;
            case KeyEvent.VK_7:
                instruction = 7;
            case KeyEvent.VK_8:
                instruction = 8;
            case KeyEvent.VK_9:
                instruction = 9;
            case KeyEvent.VK_SPACE:
                instruction = 0;
        }
    }
}