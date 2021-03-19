import java.awt.event.*;
import javax.swing.*;



public class MyFrame extends JFrame implements KeyListener
{

    MyPanel panel;

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
        //System.out.println(e.getKeyCode() + " -\t" + e.getKeyChar());
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_1:
                panel.setInstruction(1);
            case KeyEvent.VK_2:
                panel.setInstruction(2);
            case KeyEvent.VK_3:
                panel.setInstruction(3);
            case KeyEvent.VK_4:
                panel.setInstruction(4);
            case KeyEvent.VK_5:
                panel.setInstruction(5);
            case KeyEvent.VK_6:
                panel.setInstruction(6);
            case KeyEvent.VK_7:
                panel.setInstruction(7);
            case KeyEvent.VK_8:
                panel.setInstruction(8);
            case KeyEvent.VK_9:
                panel.setInstruction(9);
            case KeyEvent.VK_SPACE:
                panel.setInstruction(0);
        }
    }
}