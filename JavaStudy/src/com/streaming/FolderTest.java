package com.streaming;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FolderTest {
    public static void main(String[] args) {
        File dirFile = new File("/Users/admin/Downloads");
        if (dirFile.isDirectory()) {
            String[] allResults = dirFile.list();
            for (String name : allResults) {
                System.out.println(name);
            }
        }
        System.out.println("-----------");
        Filter_Name fileAccept = new Filter_Name();
        fileAccept.setExtendName(".csv");
        if (dirFile.isDirectory()) {
            String[] allResults = dirFile.list(fileAccept);
            for (String name : allResults) {
                System.out.println(name);
            }
        }
    }
}
