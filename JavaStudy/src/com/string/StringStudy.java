package com.string;

import java.util.Locale;

public class StringStudy {
    public static void main(String[] args) {
        char[] c = {'J', 'a', 'v', 'a'};
        String s = new String(c);
        System.out.println(s.toString());
        String s1 = "java";
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(i);
        }
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.indexOf("a"));
        System.out.println(s.substring(1, 3));
        System.out.println(s.substring(1, 4));

        String s2 = "This is test strings";
        String[] s3 = s2.split(" ");
        for (String i: s3) {
            System.out.print(i + ',');
        }
        System.out.println("\n" + s2.toUpperCase(Locale.ROOT));
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s2.toLowerCase());

        // 格式化字符串
        String str = String.format("我的名字是%s，今年%d岁。", "小明", 18);
        System.out.println(str);
        System.out.println(String.format("我的名字是%s，今年%d岁。", "小明", 18));
        String str2 = str.replace("小明", "小黑");
        System.out.println(str2);
        // StringBuilder类
        StringBuilder str3 = new StringBuilder(str2);
        System.out.println(str3.reverse());
    }
}
