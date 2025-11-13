package PaPlats.Sprint4.ChattDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//This solution is not really single thread, it only looks that way.
//Works because actionPerformed is executed in the Event Dispatch Thread
//the rest of the code is not.


public class ChatSingleThread extends JFrame implements ActionListener {

    String namn;
    InetAddress iadr;
    int port;
    MulticastSocket so;
    JTextArea txt = new JTextArea(20, 30);
    JTextArea userList = new JTextArea( 20, 10);
    JScrollPane sp = new JScrollPane(txt);
    JTextField skriv = new JTextField();
    InetSocketAddress group;
    NetworkInterface netIf = NetworkInterface.getByName("wlan3");
    Set<String> userSet = new HashSet<>();
    //List<String> userSet = new ArrayList<>();

    public ChatSingleThread(String gruppadr, int portNr) throws IOException{

        namn = JOptionPane.showInputDialog("Ditt namn ");
        iadr = InetAddress.getByName(gruppadr);
        port = portNr;
        group = new InetSocketAddress(iadr, port);

        setTitle("Chat "+namn);
        txt.setEditable(false);
        add(sp, BorderLayout.WEST);
        add(userList, BorderLayout.EAST);
        add(skriv, BorderLayout.SOUTH);
        skriv.addActionListener(this);
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        so = new MulticastSocket(port);
        so.joinGroup(group, netIf);
        sändMedd("UPPKOPPLAD");
        sändMedd("NEWUSER");

        byte[] data = new byte[1024];
        while(true){
            try{

                DatagramPacket packet = new DatagramPacket(data, data.length);
                so.receive(packet);
                String medd = new String(data, 0, packet.getLength());

                if (medd.trim().endsWith("NEWUSER")){
                    String newName = medd.substring(0, medd.indexOf(':'));
                    userSet.add(newName);
                    updateUserList();
                    sändMedd("OLDUSER");
                }
                else if (medd.trim().endsWith("OLDUSER")){
                    String oldName = medd.substring(0, medd.indexOf(':'));
                    userSet.add(oldName);
                    updateUserList();
                }
                else {
                    txt.append(medd + "\n");
                }
            }
            catch (IOException e){
                break;
            }
        }
    }

    private void updateUserList(){
        userList.setText("");
        for (String s : userSet){
            userList.append(s + "\n");
        }
    }
    
    private void sändMedd(String s){

        byte[] data = (namn + ": " +s).getBytes();
        DatagramPacket packet= new DatagramPacket(data, data.length, iadr, port);
        try{
            so.send(packet);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == skriv){
            sändMedd(skriv.getText());
            skriv.setText("");
        }
        else {
            sändMedd("Hej allesammans");
        }
    }
    
    public static void main (String[] args) throws IOException{
        ChatSingleThread c = new ChatSingleThread(
        //        "234.235.236.237", 12540);
                "230.1.1.1", 12345);
    }
}
