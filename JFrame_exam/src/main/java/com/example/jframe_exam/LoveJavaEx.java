package com.example.jframe_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoveJavaEx extends JFrame {
    public LoveJavaEx(){
        setTitle("마우스 올리기 내리기 연습");
        setSize(400,400);
        JLabel la = new JLabel("사랑해");
        Container cp = getContentPane();
        cp.add(la);
        la.setSize(260,40);
        la.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                //MouseEvent a = (MouseEvent)e.getSource();
                JLabel la = (JLabel)e.getSource();
                la.getText();
            }
            public void mouseExited(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                la.setText("love java");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoveJavaEx();
    }
}
