package com.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        DatagramPacket send_packet = null;
        DatagramPacket receive_packet = null;
        int port = 5151;        //服务器监听端口号
        try {
            socket = new DatagramSocket(port);          //创建连接对象
            System.out.println("服务器启动！");
            byte[] r = new byte[1024];                  //创建缓存数组
            receive_packet = new DatagramPacket(r, r.length);        //创建数据包对象
            socket.receive(receive_packet);             //接收数据包
            InetAddress client_ip = receive_packet.getAddress();     //客户端地址
            int client_port = receive_packet.getPort();              //客户端端口号
            byte[] data = receive_packet.getData();                  //客户端字节数据
            int len = receive_packet.getLength();                    //数据有效长度
            String str1 = new String(data, 0, len);           //将字节数据转换成字符串
            System.out.println("客户端" + client_ip + ":" + client_port + "发送的消息是: " + str1);
            String response = "Hello, I am Server!";
            byte[] s = response.getBytes();
            send_packet = new DatagramPacket(s, s.length, client_ip, client_port);      //创建响应数据包对象
            socket.send(send_packet);               //发送响应数据包
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            socket.close();
        }
    }
}
