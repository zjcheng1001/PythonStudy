package com.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServerSocket {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        int port = 5050;
        while (true) {
            try {
                serverSocket = new ServerSocket(port);
                System.out.println("服务器启动！");
            } catch (IOException e) {
                System.out.println("正在监听");             //ServerSocket对象不能重复创建
            }
            try {
                System.out.println("等待客户端请求");
                socket = serverSocket.accept();
                System.out.println("客户端的地址是: " + socket.getInetAddress() + ":" + socket.getPort());
            } catch (IOException e) {
                System.out.println("正在等待客户");
            }
            if (socket != null) {
                new ThreadTest(socket);           //为每个客户端启动一个专门的线程
            }
        }
    }
}
