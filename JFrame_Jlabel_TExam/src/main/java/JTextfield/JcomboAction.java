package JTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcomboAction extends JFrame {
    private ImageIcon[] imageIcon = {
            new ImageIcon("JFrame_Jlabel_TExam/images/icon1.png"),
            new ImageIcon("JFrame_Jlabel_TExam/images/icon2.png"), new ImageIcon("JFrame_Jlabel_TExam/images/icon3.png"),
            new ImageIcon("JFrame_Jlabel_TExam/images/icon4.png"),
    };
    private String[] fruits = {"apple", "banana", "kiwi", "mango"};
    private JLabel jl = new JLabel(imageIcon[0]);
    public JcomboAction(){
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JComboBox fruitBox = new JComboBox(fruits);
        setSize(300,300);

        fruitBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox jComboBox = (JComboBox) e.getSource();
                int index = jComboBox.getSelectedIndex();
                jl.setIcon(imageIcon[index]);
            }
        });
        cp.add(jl);
        cp.add(fruitBox);

    }

    public static void main(String[] args) {
        new JcomboAction();
    }

}
