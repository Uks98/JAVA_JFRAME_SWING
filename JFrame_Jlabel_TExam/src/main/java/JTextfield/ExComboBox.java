package JTextfield;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;

// 11-12 콤보박스 만들기
public class ExComboBox extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "apple", "banana", "kiwi", "mango", "pear"};
    private String[] names = {"apple", "banana", "kiwi", "mango", "pear", "apple", "banana", "kiwi", "mango", "pear"};
    public ExComboBox(){
        setTitle("콤보박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JComboBox<String> jComboBox = new JComboBox<>(fruits);
        cp.add(jComboBox);

        JComboBox<String>nameCombo = new JComboBox<String>();
        for(int i = 0; i < names.length; i ++){
            nameCombo.addItem(names[i]);
            cp.add(nameCombo);
        }
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExComboBox();
    }
}
