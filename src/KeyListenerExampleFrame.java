import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExampleFrame extends JFrame implements KeyListener, MouseListener {
    JLabel label1;
    KeyListenerExampleFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Working with Key and Mouse Listeners");
        this.setSize(500,500);
        this.setLayout(null);
        setVisible(true);
        ImageIcon icon = new ImageIcon("src/amogus.png");
        label1= new JLabel(icon);
        label1.setSize(100,100);
        label1.setBackground(Color.BLUE);
        label1.setOpaque(true);
        label1.setLocation(50, 50);
        add(label1);

        this.addKeyListener(this);

        label1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                label1.setLocation(e.getXOnScreen() - 55, e.getYOnScreen() - 80);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        label1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label1.setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label1.setBackground(Color.BLUE);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) label1.setLocation(label1.getX(), label1.getY() - 15);
        if (e.getKeyCode() == KeyEvent.VK_DOWN) label1.setLocation(label1.getX(), label1.getY() + 15);
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) label1.setLocation(label1.getX() + 15, label1.getY());
        if (e.getKeyCode() == KeyEvent.VK_LEFT) label1.setLocation(label1.getX() - 15, label1.getY());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}