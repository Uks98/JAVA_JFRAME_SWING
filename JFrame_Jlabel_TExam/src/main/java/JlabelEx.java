import com.example.jframe_jlabel_texam.JLabelEx;

import javax.swing.*;
import java.awt.*;

//예제 11-2
public class JlabelEx extends JFrame {
    public JlabelEx(){
        setTitle("레이블 예제");
        setVisible(true);
        Container cp = getContentPane();
        JLabel jl = new JLabel("사랑합니다");
        ImageIcon icon = new ImageIcon("JFrame_Jlabel_TExam/beauty.jpg");
        JLabel label = new JLabel("보고싶으면! 전화하세요",icon,SwingConstants.CENTER);

        cp.add(jl);
        cp.add(label);
        setSize(400,600);

    }

    public static void main(String[] args) {
        new JLabelEx();
    }
}
