package com.example.jcomponent_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcomponentEx extends JFrame {
    public JcomponentEx(){
        setTitle("jcomponent 예제");
        setSize(400,400);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton j1 = new JButton("magenta/yellow");
        JButton j2 = new JButton("disable_button");
        JButton j3 = new JButton("getx gety");

        j1.setBackground(Color.YELLOW);
        j1.setForeground(Color.MAGENTA);
        j1.setFont(new Font("Arial",Font.ITALIC,20));
        j2.setEnabled(false);
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jc = (JButton) e.getSource();
                JcomponentEx j = (JcomponentEx) jc.getTopLevelAncestor(); //상태창 변경
                j.setTitle(jc.getX() + "," + jc.getY());
            }
        });
        cp.add(j1);cp.add(j2);cp.add(j3);
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JButton jButton = (JButton) e.getSource();
            jButton.setText("nono");
            j1.setText("nono");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
    new JcomponentEx();
    }
}
