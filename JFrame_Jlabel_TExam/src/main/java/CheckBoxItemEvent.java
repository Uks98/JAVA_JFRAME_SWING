
//11-5 itemEvent를 이용해 체크박스로 값 합산하기

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvent extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] names = {"사과", "배", "체리"};
    private JLabel sumLabel;

    public CheckBoxItemEvent() {
        setTitle("체크박스예제");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("사과 100원,배 500원 체리 20000원"));

        MyItemListener listener = new MyItemListener();

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            cp.add(fruits[i]);
            fruits[i].addItemListener(listener);

        }

        sumLabel = new JLabel("현재 0원입니다");
        cp.add(sumLabel);
        setSize(250, 200);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (e.getItem() == fruits[0]) {
                    sum += 100;
                } else if (e.getItem() == fruits[1]) {
                    sum += 500;
                } else {
                    sum += 20000;
                }
            } else {
                if (e.getItem() == fruits[0]) {
                    sum -= 100;
                } else if (e.getItem() == fruits[1]) {
                    sum -= 100;
                } else {
                    sum -= 20000;
                }
            }
            sumLabel.setText("현재" + sum + "원입니다");
        }
    }
    public static void main(String[] args) {
        new CheckBoxItemEvent();
    }
}