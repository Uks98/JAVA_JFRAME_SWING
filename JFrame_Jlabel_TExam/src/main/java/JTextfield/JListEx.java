package JTextfield;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

//예제 11 - 10 리스트 만들기
public class JListEx extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "apple", "banana", "kiwi", "mango", "pear"};
    private ImageIcon[] imageIcon = {
            new ImageIcon("JFrame_Jlabel_TExam/images/icon1.png"),
            new ImageIcon("JFrame_Jlabel_TExam/images/icon3.png"), new ImageIcon("JFrame_Jlabel_TExam/images/icon2.png"),
            new ImageIcon("JFrame_Jlabel_TExam/images/icon4.png"),
    };

    public JListEx() {
        setTitle("리스트 만들기 예제");
        setSize(300, 300);
        setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JList<String> jList = new JList<String>(fruits);


        JList<ImageIcon> iconList = new JList<ImageIcon>();
        iconList.setListData(imageIcon);

        JList<String> scrollList = new JList<String>(fruits);
        cp.add(jList);
        cp.add(iconList);
        cp.add(new JScrollPane(scrollList));

    }
    public static void main(String[] args) {
        new JListEx();
    }
}
