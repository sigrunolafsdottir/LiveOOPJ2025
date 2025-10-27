package Distans.Sprint3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo extends JFrame implements ActionListener {

    JPanel minPanel = new JPanel();
    JLabel etikett = new JLabel ("<html><H1>Välkomna</h1> till mitt program</html>");
    JButton button = new JButton("Tryck här");
    JButton button2 = new JButton("Eller här");

    public GUIDemo(){

        add(minPanel);
        minPanel.add(button);
        minPanel.add(etikett);
        button.addActionListener(this);
        button2.addActionListener(this);
        minPanel.add(button2);

        setTitle("GUIDemo");
       // setSize(500, 100);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("hej from knapp 1");
        }
        else{
            System.out.println("hej from knapp 2");
        }

    }

    void main(){

    }

}
