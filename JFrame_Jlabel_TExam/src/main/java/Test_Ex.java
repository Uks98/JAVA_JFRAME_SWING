import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Test_Ex extends JFrame {
    private JRadioButton[] j = new JRadioButton[3];
    private String[] name = {"사과","배","체리"};
    private ImageIcon[] imageIcon = {
            new ImageIcon("JFrame_Jlabel_TExam/images/icon1.png"),
            new ImageIcon("JFrame_Jlabel_TExam/images/icon2.png"), new ImageIcon("JFrame_Jlabel_TExam/images/icon3.png"),
    };
    private JLabel js = new JLabel();
    public Test_Ex() {
        setTitle("체크박스와 itemEvent");
        setSize(300, 300);
        setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton jb = new JButton("Action");
        cp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton j = (JButton) e.getSource();
             if(j.getText().equals("Action")){
                 j.setText("액션");
             }else{
                 j.setText("Action");
             }
            }
        });
    }

    public static void main(String[] args) {
        new Test_Ex();
    }
}
