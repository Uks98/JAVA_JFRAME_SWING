package com.example.jframe_jlabel_texam;

import javax.swing.*;
import java.awt.*;

//예제 11 - 2
public class JLabelEx extends JFrame {
    public JLabelEx(){
        setTitle("레이블 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel jl = new JLabel("사랑합니다");

        ImageIcon icon = new ImageIcon("JFrame_Jlabel_TExam/images/banana.jpg");
        JLabel image = new JLabel(icon);

        ImageIcon icon2 = new ImageIcon("JFrame_Jlabel_TExam/images/normalIcon.gif");
        JLabel jLabel = new JLabel("보고싶으면 전화하세요",icon2,SwingConstants.CENTER);

        c.add(jl);
        c.add(image);
        c.add(jLabel);
        setSize(400,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelEx();
    }
}
