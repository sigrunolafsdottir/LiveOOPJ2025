package Distans.Sprint3.ActionListenerDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo extends JFrame  {

    JPanel minPanel = new JPanel();
    JLabel etikett = new JLabel ("<html><H1>Välkomna</h1> till mitt program</html>");
    JButton button = new JButton("Tryck här");
    JButton button2 = new JButton("Eller här");

    public GUIDemo(){

        add(minPanel);
        minPanel.add(button);
        minPanel.add(etikett);
        button.addActionListener(new Button1ActionListener(button));
        button2.addActionListener(new Button2ActionListener());
        minPanel.add(button2);

        setTitle("GUIDemo");
       // setSize(500, 100);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    void main(){

    }

   

}
