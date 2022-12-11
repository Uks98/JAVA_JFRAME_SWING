package JTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameField extends JFrame {
        public NameField(){
            setTitle("텍스트영역 만들기 예제");
            setVisible(true);
            setSize(300,300);
            Container cp = getContentPane();
            cp.setLayout(new FlowLayout());
            JLabel intro = new JLabel("입력후 엔터를 눌러주세요");
            JTextField jTextField = new JTextField(20);
            JTextArea jTextArea = new JTextArea(20,20);
            cp.add(new JScrollPane(jTextArea));
            cp.add(intro);
            cp.add(jTextField);
            cp.add(jTextArea);
            jTextField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JTextField t = (JTextField) e.getSource();
                    jTextArea.append(t.getText() + "\n");
                    t.setText("");
                }
            });
        }

    public static void main(String[] args) {
        new NameField();
    }
}
