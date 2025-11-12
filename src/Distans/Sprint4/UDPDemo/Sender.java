package Distans.Sprint4.UDPDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {

    int port = 33333;


    Sender(){

        Scanner sc = new Scanner(System.in);

        try(DatagramSocket socket = new DatagramSocket()) {
            InetAddress ip = InetAddress.getLocalHost();

            String mess;

            while((mess = sc.nextLine())!=null){

                byte[] data = mess.getBytes();
                DatagramPacket p = new DatagramPacket(data, data.length, ip, port);
                socket.send(p);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    void main(){

    }
}
