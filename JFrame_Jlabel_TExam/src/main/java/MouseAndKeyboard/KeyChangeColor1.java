package MouseAndKeyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//예제 10-7 f1키를 누르면 컨텐트 팬 색상 변경
public class KeyChangeColor1 extends JFrame {
    public KeyChangeColor1(){
        setTitle("색상 변경 예제");
        setSize(400,400);
        setVisible(true);

        Container cp = getContentPane();
        cp.setFocusable(true);
        cp.requestFocus();
        cp.setBackground(Color.green);
        cp.setLayout(new FlowLayout());
        JLabel intro = new JLabel("키가 입력되었음");

        cp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_F1){
                    cp.setBackground(Color.YELLOW);
                }else if(e.getKeyChar() == '%'){
                    cp.setBackground(Color.BLACK);
                }
                else{
                    System.out.println(e.getKeyChar());
                    intro.setText(e.getKeyChar() + "가 입력되었습니다.");
                }
            }
        });
        cp.add(intro);
    }
    public static void main(String[] args) {
        new KeyChangeColor1();
    }
}
