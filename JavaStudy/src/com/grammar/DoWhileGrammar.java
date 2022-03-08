package com.grammar;

public class DoWhileGrammar {
    /**
     * do...while语句先执行一次，然后再进行判断
     */
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("x = " + x);
            x ++;
        } while (x <= 4);
    }
}
