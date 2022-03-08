package com.streaming;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        byte[] b = new byte[1024];      //设置字节缓冲区
        int n = -1;
        try {
            FileInputStream f = new FileInputStream("/Users/admin/Desktop/copy_paste.txt");
            while ((n=f.read(b, 0, 1024)) != -1) {
                String s = new String(b, 0, n);
                System.out.println(s);
            }
            f.close();
        } catch(IOException e) {
            System.out.println("文件读取失败");
        }
    }
}
