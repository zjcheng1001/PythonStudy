package com.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        DatagramPacket send_packet = null;
        DatagramPacket receive_packet = null;
        String server_ip = "127.0.0.1";         //服务器的IP地址
        int server_port = 5151;                 //服务器的端口号
        String str = "Hello, I am Client!";
        byte[] data = str.getBytes();           //将发送信息转换成字节数组
        try {
            socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName(server_ip);         //将服务器IP地址封装成InetAddress对象
            send_packet = new DatagramPacket(data, data.length, address, server_port);   //创建数据包对象
            socket.send(send_packet);           //向服务器发送数据
            byte[] r = new byte[1024];          //设置接收缓冲区
            receive_packet = new DatagramPacket(r, r.length);       //创建数据包对象
            socket.receive(receive_packet);     //接收数据包
            byte[] response = receive_packet.getData();             //读取数据包中的数据信息
            int len = receive_packet.getLength();                   //获取数据长度
            String str1 = new String(response, 0, len);       //将字节数据转换成字符串
            System.out.println("服务器响应的信息是: " + str1);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            socket.close();
        }
    }
}
