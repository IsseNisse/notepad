import javax.swing.*;
import java.awt.*;

public class grafik extends Canvas {

    public grafik() {
        setSize(800,600);
        JFrame frame = new JFrame("Grafik");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint (Graphics g) {
        ritaHus(g);
    }

    private void ritaHus(Graphics g) {
        g.setColor(new Color(0xb7ff00));
        g.drawRect(100,100,300,200);
        g.setColor(new Color(0xb7ff00));
        g.fillOval(100,100,300,300);
    }

    public static void main(String[] args) {
        grafik minGrafik = new grafik();

    }
}
