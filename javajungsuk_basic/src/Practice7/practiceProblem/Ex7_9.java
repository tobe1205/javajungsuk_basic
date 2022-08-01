package Practice7.practiceProblem;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
아래의 EventHandler를 익명 클래스(anonymous class) 로 변경하시오.
 */
/*
import java.awt.*;
import java.awt.event.*;
class Ex7_9
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.addWindowListener(new EventHandler());
    }
}
class EventHandler extends WindowAdapter
{
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
*/
class Ex7_9
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() { //조상클래스의 인스턴스를 받아온다.
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

