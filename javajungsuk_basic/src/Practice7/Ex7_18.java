package Practice7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
//        b.addActionListener(new EventHandler());
    }
}
//class EventHandler implements ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("ActionEvent occurred!!!");
//    }

