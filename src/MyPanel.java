import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

    MyPanel(){
        this.setPreferredSize(new Dimension(1000, 1000));
        this.setBackground(Color.black);
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.red);
        g2D.drawOval(300,300,400,400);
    }
}