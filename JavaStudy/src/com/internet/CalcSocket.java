package com.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcSocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Socket socket = null;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        String ip = "127.0.0.1";
        int port = 5050;

        try {
            socket = new Socket(ip, port);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("请输入一个正整数的四则运算表达式: ");
            while (scanner.hasNext()) {
                input = scanner.nextLine();
                if (!input.equals("0")) {
                    outputStream.writeUTF(input);
                    String result = inputStream.readUTF();
                    System.out.println("服务器返回的计算结果是: " + result);
                    System.out.println("请输入一个正整数的四则运算表达式(输入0退出): ");
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("与服务器连接中断");
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                socket.close();
                System.out.println("连接结束");
            } catch (Exception e) {}
        }
    }
}
