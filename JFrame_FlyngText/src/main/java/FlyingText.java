import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FlyingText extends JFrame {
    private int FLYING = 10;
    private JLabel jl = new JLabel("hello");

    public FlyingText(){
        setTitle("플라잉 텍스트");
        setSize(500,500);
        Container cp = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        jl.setLocation(50,50); //초기위치
        jl.setSize(300,300);
        setVisible(true);
        cp.add(jl);
        cp.setFocusable(true);
        cp.requestFocus();

        cp.addKeyListener(new MyKeyBoard(){
            public void keyboardMove(MouseEvent e){
                Component component = (Component)e.getSource();
                component.setFocusable(true);
                component.requestFocus();
            }
        });
    }
    class MyKeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch(keyCode) {
                case KeyEvent.VK_UP:
                    jl.setLocation(jl.getX(), jl.getY()-FLYING);
                    break;
                case KeyEvent.VK_DOWN:
                    jl.setLocation(jl.getX(), jl.getY()+FLYING);
                    break;
                case KeyEvent.VK_LEFT:
                    jl.setLocation(jl.getX()-FLYING, jl.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    jl.setLocation(jl.getX()+FLYING, jl.getY());
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new FlyingText();
    }
}
