package Distans.Sprint4.LivekodUppg3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class UDPChat extends JFrame implements ActionListener {

    String name;
    JPanel panel = new JPanel();
    JTextArea chatt = new JTextArea(20, 50);
    JTextField input = new JTextField();
    JScrollPane scroll = new JScrollPane(chatt);
    int port = 44444;
    InetAddress ip = InetAddress.getByName("239.239.239.239");
    MulticastSocket socket = new MulticastSocket(port);

    public UDPChat() throws IOException {

        name = JOptionPane.showInputDialog("Ditt namn ");

        setTitle(name);
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(scroll, BorderLayout.WEST);
        panel.add(input, BorderLayout.SOUTH);
        input.addActionListener(this);

        InetSocketAddress address = new InetSocketAddress(ip, port);
        socket.joinGroup(address, null);

        setSize(500, 300);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        while(true){
            byte[] data = new byte[1024];
            DatagramPacket p = new DatagramPacket(data, data.length);
            socket.receive(p);
            chatt.append(new String(p.getData(), 0, p.getLength()) + "\n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String text =  name + ": " + input.getText();
        DatagramPacket packet = new DatagramPacket(text.getBytes(), text.getBytes().length, ip, port);
        try {
            System.out.println(text);
            socket.send(packet);
            input.setText("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void main(){

    }


}
