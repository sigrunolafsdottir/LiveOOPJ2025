package Distans.Sprint4.UDPDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {

    int port = 33333;

    Receiver()  {

        try(DatagramSocket socket = new DatagramSocket(port)) {

            byte[] data = new byte[1024];

            while (true) {

                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String( packet.getData(), 0, packet.getLength());
                System.out.println(message);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }


    void main(){

    }
}
