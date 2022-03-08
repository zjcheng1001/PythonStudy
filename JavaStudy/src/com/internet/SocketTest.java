package com.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        Socket clientSocket = null;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        String ip = "127.0.0.1";
        int port = 5050;

        try {
            clientSocket = new Socket(ip, port);            //与服务器建立连接
            inputStream = new DataInputStream(clientSocket.getInputStream());        //创建输入流
            outputStream = new DataOutputStream(clientSocket.getOutputStream());     //创建输出流
            System.out.println("客户端启动，向服务器发送消息");
            outputStream.writeUTF("你好，我是客户端");
            String str = inputStream.readUTF();         //等待读取服务器响应的信息，进入阻塞状态
            System.out.println("服务端的响应消息：" + str);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                clientSocket.close();
            } catch (Exception e) {}
        }
    }
}
