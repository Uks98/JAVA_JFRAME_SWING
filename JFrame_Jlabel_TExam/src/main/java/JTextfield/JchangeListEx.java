package JTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

// 예제 11- 11
public class JchangeListEx extends JFrame {
    private JTextField jTextField = new JTextField(20);
    private Vector<String> v = new Vector<String>();
    private JList<String> nameList = new JList<String>(v);
    public JchangeListEx(){
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("이름 입력 후 enter 키 입력"));
        cp.add(jTextField);

        v.add("황기태");
        v.add("찬기오");
        nameList.setVisibleRowCount(5);
        nameList.setFixedCellWidth(200);
        cp.add(new JScrollPane(nameList));

        setVisible(true);
        setSize(300,300);

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField j = (JTextField) e.getSource();
                v.add(j.getText());
                jTextField.setText("");
                nameList.setListData(v);
            }
        });
    }

    public static void main(String[] args) {
        new JchangeListEx();
    }
}
