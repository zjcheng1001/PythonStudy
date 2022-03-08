package com.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ThreadTest extends Thread {
    Socket socket = null;
    DataInputStream inputStream = null;
    DataOutputStream outputStream = null;
    String str;
    String response;
    String ip;
    int port;

    public ThreadTest(Socket socket) {
        this.socket = socket;
        start();
    }

    public void run() {
        try {
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            ip = socket.getInetAddress().getHostAddress();                  //客户端的IP地址
            port = socket.getPort();                                        //客户端的端口号
            while (true) {
                str = inputStream.readUTF();
                System.out.println("客户端" + ip + ":" + port + "发送的请求内容: " + "\n" + str);
                if (str.equals("0")) {
                    System.out.println("连接结束");
                    break;
                } else {
                    response = doComputer(str);
                    outputStream.writeUTF(response);
                }
            }
        } catch (Exception e) {
            System.out.println("连接结束");
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                socket.close();
            } catch (Exception e) {
            }
        }
    }

    public String doComputer(String str) {
        String input;
        String[] sym;
        String[] data;
        int a = 0, b = 0, result = 0;
        input = str;
        data = input.split("\\D+");         //分解表达式中的正整数
        sym = input.split("\\d+");          //分解表达式中的运算符
        a = Integer.parseInt(data[0]);            //第一个正整数
        b = Integer.parseInt(data[1]);            //第二个正整数
        try {
            switch (sym[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
            }
            System.out.println("计算结果: " + input + "=" + result);
            return String.valueOf(result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("数据错误！");
            return "数据错误！";
        }
    }
}
