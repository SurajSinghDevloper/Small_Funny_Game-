import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;
public class MyFrame extends JFrame implements KeyListener{
    
    JLabel lbl;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.blue);

        lbl=new JLabel();
        lbl.setBounds(0, 0, 100, 100);
        // lbl.setBackground(Color.MAGENTA);
        // lbl.setOpaque(true);
        this.add(lbl);
        icon =new ImageIcon("logo.png.png");
        lbl.setIcon(icon);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down. Uses Keycode, int output
        switch(e.getKeyCode()){
            case 37:lbl.setLocation(lbl.getX()-10, lbl.getY());
            break;
            case 38:lbl.setLocation(lbl.getX(), lbl.getY()-10);
            break;
            case 39:lbl.setLocation(lbl.getX()+10, lbl.getY());
            break;
            case 40:lbl.setLocation(lbl.getX(), lbl.getY()+10);
            break ;
        } 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released
        System.out.println("You released key Char : "+e.getKeyChar());
        System.out.println("You released key Code : "+e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar, Char output
        switch(e.getKeyChar()){
            case 'a':lbl.setLocation(lbl.getX()-10, lbl.getY());
            break;
            case 'w':lbl.setLocation(lbl.getX(), lbl.getY()-10);
            break;
            case 's':lbl.setLocation(lbl.getX(), lbl.getY()+10);
            break;
            case 'd':lbl.setLocation(lbl.getX()+10, lbl.getY());
            break;
        }
    }
    
}
