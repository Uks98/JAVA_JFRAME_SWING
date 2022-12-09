
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

//예제 라디오버튼
public class RadioButtonItemEventEx extends JFrame{
    private String [] text = {"사과 ", "배 ", "체리"};
    private JRadioButton[] radio = new JRadioButton[3];
    private ImageIcon[] image = {
            new ImageIcon ("JFrame_Jlabel_TExam/images/apple.jpg"),
            new ImageIcon ("images/pear.jpg"),
            new ImageIcon ("images/cherry.jpg")};
    private JLabel imageLabel = new JLabel();
    public RadioButtonItemEventEx() {
        setTitle("라디오버튼예제");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel radioPanel = new JPanel(); //라디오 버튼 필수
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup g = new ButtonGroup();

        for(int i =0; i < radio.length ; i ++) {
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }
        radio[2].setSelected(true);
        c.add(radioPanel , BorderLayout.NORTH );
        c.add(imageLabel,BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setSize(250,200);
        setVisible(true);
    }
    class MyItemListener implements ItemListener{

       @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            if(e.getStateChange () == ItemEvent.DESELECTED)
                return;
            if(radio[0].isSelected())
                imageLabel.setIcon(image[0]);
            else if(radio[1].isSelected())
                imageLabel.setIcon(image[1]);
            else
                imageLabel.setIcon(image[2]);}


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new RadioButtonItemEventEx();
    }

}