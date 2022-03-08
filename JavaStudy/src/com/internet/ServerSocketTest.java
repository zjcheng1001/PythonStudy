package com.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        int port = 5050;
        try {
            serverSocket = new ServerSocket(port);              //创建绑定端口的服务器端Socket
        } catch (IOException e) {
            System.out.println(e);
        } try {
            System.out.println("服务器启动！");
            socket = serverSocket.accept();                     //监听并接受到此socket的连接。此方法在连接传入之前处于阻塞状态
            inputStream = new DataInputStream(socket.getInputStream());     //创建输入流
            outputStream = new DataOutputStream(socket.getOutputStream());  //创建输出流
            String str = inputStream.readUTF();                 //从输入流读取字符串，读取结束之前处于阻塞状态
            System.out.println("客户端发来的消息是：" + str);
            outputStream.writeUTF("你好，我是服务端");        //向输出流写入字符串
        } catch (Exception e) {
            System.out.println(e);;
        } finally {
            try {//关闭网络连接
                outputStream.close();
                inputStream.close();
                serverSocket.close();
                socket.close();
            } catch (Exception e) {}
        }
    }
}
