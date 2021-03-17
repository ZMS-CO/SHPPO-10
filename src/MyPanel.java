import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

    MyPanel(){
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(1200, 675));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.red);
        g2D.drawOval(200,200,400,400);
    }
}