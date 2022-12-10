import javax.swing.*;
import java.awt.*;

//11장 체크박스 11-4 첫번쨰
public class Check_box1_ex extends JFrame {
    public Check_box1_ex(){
        setTitle("체크 박스 만들기 예제");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,200);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon("JFrame_Jlabel_TExam/images/cherry1.jpg");
        ImageIcon pressIcon = new ImageIcon("JFrame_Jlabel_TExam/images/selectedCherryIcon.jpg");
        JCheckBox jCheckBox1 = new JCheckBox("사과");
        JCheckBox jCheckBox2 = new JCheckBox("배",true);
        JCheckBox jCheckBox3 = new JCheckBox("체리",imageIcon);
        jCheckBox3.setBorderPaintedFlat(true);
        jCheckBox3.setSelectedIcon(pressIcon);
        cp.add(jCheckBox1);
        cp.add(jCheckBox2);
        cp.add(jCheckBox3);


    }

    public static void main(String[] args) {
        new Check_box1_ex();
    }
}
