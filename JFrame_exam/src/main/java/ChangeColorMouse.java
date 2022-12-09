//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class ChangeColorMouse extends JFrame {
//    public ChangeColorMouse(){
//        setTitle("색깔 변경하기");
//        setSize(300,400);
//        setLayout(new FlowLayout());
//        Container cp = getContentPane();
//        JLabel jLabel = new JLabel("사랑해");
//        cp.add(jLabel);
//        jLabel.setSize(260,100);
//        cp.setBackground(Color.GREEN);
//        setVisible(true);
//        jLabel.addMouseListener(new MouseAdapter() {
//            public void mouseDragged(MouseEvent e) {
//                JComponent c = (JComponent) e.getSource();
//                c.setBackground(Color.YELLOW);
//            }
//
//                public void mouseReleased(MouseEvent e) {
//                    JComponent c = (JComponent) e.getSource();
//                    c.setBackground(Color.GREEN);
//            }
//        });
//    }
//    class MyMouseListener extends MouseAdapter{
//
//        public void mouseDragged(MouseEvent e) {
//            JComponent c = (JComponent)
//                    c.setBackground(Color.YELLOW);
//        }
//        public void mouseReleased(MouseEvent e) {
//            JComponent c = (JComponent) e.getso
//            c.setBackground(Color.GREEN);
//        }
//
//    }
//    public static void main(String[] args) {
//    new ChangeColorMouse();
//    }
//}

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;




public class ChangeColorMouse extends JFrame{
    JLabel label = new JLabel("사랑해");

    public ChangeColorMouse() {
        setTitle("색 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);
        c.add(label);
        MyMouseListener m1 = new MyMouseListener();
        c.addMouseMotionListener(m1);
        c.addMouseListener(m1);

        setSize(250,150);
        setVisible(true);

    }
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {
            super.mouseDragged(e);
            JComponent jComponent = (JComponent) e.getSource();
            jComponent.setBackground(Color.yellow);
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            super.mouseReleased(e);
            JComponent jComponent = (JComponent) e.getSource();
            jComponent.setBackground(Color.yellow);
        }
    }
    public static void main(String[] args) {
        new ChangeColorMouse();
    }

}
