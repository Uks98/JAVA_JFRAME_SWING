package MouseAndKeyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//예제 10-4 마우스로 문자열 이동시키기
public class MouseListenerEx extends JFrame {
    public MouseListenerEx(){
        setTitle("마우스 이벤트 예제");
        setSize(300,300);
        Container cp = getContentPane();
        cp.setLayout(null);
        JLabel jl = new JLabel("hello");
        jl.setLocation(30,30);
        jl.setSize(50,20);
        cp.add(jl);
        setVisible(true);
        cp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                jl.setLocation(x,y);
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
        });

    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}

