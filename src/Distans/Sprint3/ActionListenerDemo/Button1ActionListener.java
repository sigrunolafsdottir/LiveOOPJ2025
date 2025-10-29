package Distans.Sprint3.ActionListenerDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1ActionListener implements ActionListener {

    //Om jag vill interagera med någon komponent måste jag skicka med
    //komponenten, annars kommer jag inte åt den eftersom vi nu är i
    //en annan klass än där komponenten definierades
    public JButton button;

    public Button1ActionListener(JButton b){
        button = b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hej from knapp 1");
        button.setText("pressed");  //funkar pga skickade med den till konstruktorn
    }
}




