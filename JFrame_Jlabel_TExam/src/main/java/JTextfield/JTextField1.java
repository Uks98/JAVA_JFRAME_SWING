package JTextfield;

import javax.swing.*;
import java.awt.*;

//예제 11-8 간단한 텍스트 필드 제작하기
public class JTextField1 extends JFrame {
    public JTextField1(){
        setTitle("텍스트 필드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("이름"));
        cp.add(new JTextField(20));
        cp.add(new JLabel("학과"));
        cp.add(new JTextField("컴퓨터 공학과",20));
        cp.add(new JLabel("주소"));
        cp.add(new JTextField("서울시 ... ",20));

        setSize(300,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JTextField1();
    }
}
