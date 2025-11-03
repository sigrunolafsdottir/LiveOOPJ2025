package Distans.Sprint3.ContainerDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerDemo extends JFrame implements ActionListener {


    JPanel bigpanel = new JPanel();
    JPanel buttonpanel = new JPanel();
    JPanel textpanel = new JPanel();

    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JTextArea text = new JTextArea(10, 50);

    public ContainerDemo(){
        add(bigpanel);
        bigpanel.setLayout(new BorderLayout());
        bigpanel.add(buttonpanel, BorderLayout.NORTH);
        bigpanel.add(textpanel, BorderLayout.CENTER);

        buttonpanel.add(b1);
        buttonpanel.add(b2);
        buttonpanel.add(b3);
        buttonpanel.add(b4);

        b1.addActionListener(this);


        b2.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     IO.println("hej från kanpp 2, distansdemo + annan ändring som bör ge konflikt");
                                     IO.println("hej från kanpp 2, distansdemo, konfliktändring!!!!");
                                 }
                             });


        b3.addActionListener(_ -> IO.println("hej från knapp 3"));

        b4.addActionListener((ActionEvent e) -> {IO.println("hej från knapp 4"+e.paramString());
                                                IO.println("hej från knapp 4 gitHubkonflikt"); });

        textpanel.add(text);

        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            JButton b = (JButton)e.getSource();
            Container container = b.getParent();


            if (e.getSource() instanceof JButton myButton){
                //utföra en säker cast eller använda den färdigcastade MyButton
            }

            JPanel p = (JPanel) container;

            Component[] components = p.getComponents();
            IO.println(((JButton)components[1]).getText());

            p.revalidate();
            p.repaint();

            System.out.println(container == buttonpanel);
            System.out.println(container == textpanel);

        }
    }


    void main(){

    }

}
