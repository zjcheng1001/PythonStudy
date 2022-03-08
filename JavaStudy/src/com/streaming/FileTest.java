package com.streaming;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("/Users/admin/Desktop/copy_paste.txt");
        System.out.println("文件" + f.getName() + "： " + (f.exists() ? "存在" : "不存在"));
        System.out.println("文件" + f.getName() + "： " + (f.canRead() ? "可读" : "不可读"));
        System.out.println("文件" + f.getName() + "： " + (f.canWrite() ? "可写" : "不可写"));
        System.out.println("文件名：" + f.getName());
        System.out.println("文件绝对路径：" + f.getAbsolutePath());
        System.out.println("父文件夹名称：" + f.getParent());
        System.out.println("文件最后修改时间：" + f.lastModified());
        System.out.println("文件大小：" + f.length());
    }
}
