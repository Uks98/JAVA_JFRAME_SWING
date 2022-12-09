import javax.swing.*;
import java.awt.*;

//예제 11-3 버튼을 이용한 버튼 만들기
public class ButtonEx extends JFrame {
    public ButtonEx(){
        setTitle("이미지 버튼 예제");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        //이미지 불러오기
        ImageIcon normalIcon = new ImageIcon("JFrame_Jlabel_TExam/images/normalIcon.gif");
        ImageIcon rollover = new ImageIcon("JFrame_Jlabel_TExam/images/rolloverIcon.gif");
        ImageIcon press = new ImageIcon("JFrame_Jlabel_TExam/images/pressedIcon.gif");

        JButton jButton = new JButton("전화받으셔요",normalIcon);
        jButton.setRolloverIcon(rollover);
        jButton.setPressedIcon(press);

        cp.add(jButton);
        setSize(250,150);

    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
