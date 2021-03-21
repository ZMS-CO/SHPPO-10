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

    public void sendInstruction(Instruction instr)
    {
        panel.addInstruction(instr);
    }

    public void printInstructions()
    {
        panel.printInstructions();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_1:
                {panel.setInstruction(1); break;}
            case KeyEvent.VK_2:
                {panel.setInstruction(2); break;}
            case KeyEvent.VK_3:
                {panel.setInstruction(3); break;}
            case KeyEvent.VK_4:
                {panel.setInstruction(4); break;}
            case KeyEvent.VK_5:
                {panel.setInstruction(5); break;}
            case KeyEvent.VK_6:
                {panel.setInstruction(6); break;}
            case KeyEvent.VK_7:
                {panel.setInstruction(7); break;}
            case KeyEvent.VK_8:
                {panel.setInstruction(8); break;}
            case KeyEvent.VK_9:
                {panel.setInstruction(9); break;}
            case KeyEvent.VK_SPACE:
                {panel.setInstruction(0); break;}
            case KeyEvent.VK_UP:
                {panel.setInstruction(10); break;}
            case KeyEvent.VK_DOWN:
                {panel.setInstruction(11); break;}
            case KeyEvent.VK_LEFT:
                {panel.setInstruction(12); break;}
            case KeyEvent.VK_RIGHT:
                {panel.setInstruction(13); break;}
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println(e.getKeyCode() + " -\t" + e.getKeyChar());

        switch(e.getKeyCode())
        {
            case KeyEvent.VK_UP:
                panel.setInstruction(0);
            case KeyEvent.VK_DOWN:
                panel.setInstruction(0);
            case KeyEvent.VK_LEFT:
                panel.setInstruction(0);
            case KeyEvent.VK_RIGHT:
                panel.setInstruction(0);
        }

    }
}