import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//연습 문제1 풀어보기
public class ExamTest extends JFrame {
    public ExamTest(){
        setTitle("체크박스 예제");
        setVisible(true);
        setSize(250,100);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JCheckBox unableBox = new JCheckBox("버튼 비활성화");
        JCheckBox hideBox = new JCheckBox("버튼 숨기기");
        JButton testButton = new JButton("버튼 추가");

        unableBox.setBorderPaintedFlat(true);
        hideBox.setBorderPaintedFlat(true);

        unableBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    testButton.setEnabled(false);
                }else{
                    testButton.setEnabled(true);
                }
            }
        });
        hideBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    testButton.hide();
                }else{
                }
            }
        });
        cp.add(unableBox);
        cp.add(hideBox);
        cp.add(testButton);

    }

    public static void main(String[] args) {
        new ExamTest();
    }
}
