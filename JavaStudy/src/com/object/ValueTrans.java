package com.object;

public class ValueTrans {
    public static void changeValue(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("changeValue(): i: " + i + " j: " + j);
    }

    public static void main(String[] args) {
        int a = 3, b = 4;
        changeValue(a, b);
        System.out.println("a: " + a + " b: " + b);
    }
}
