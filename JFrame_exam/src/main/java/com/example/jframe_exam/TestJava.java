package com.example.jframe_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestJava extends JFrame {
        public TestJava(){
            setTitle("색변경하기");
            setSize(400,400);
            setLayout(new FlowLayout());
            Container cp = getContentPane();
            cp.setBackground(Color.GREEN);
            JLabel jl = new JLabel("미친수업");
            cp.add(jl);
            setVisible(true);
            MyMouseListener myMouse = new MyMouseListener();
            addMouseListener(myMouse);
            addMouseMotionListener(myMouse);
        }

        class MyMouseListener extends MouseAdapter{
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                super.mouseDragged(e);
                JComponent c = (JComponent) e.getSource();
                c.setBackground(Color.YELLOW);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                super.mouseReleased(e);
                JComponent j = (JComponent) e.getSource();
                j.setBackground(Color.GREEN);
            }
        }
    public static void main(String[] args) {
    new TestJava();
        }
}
