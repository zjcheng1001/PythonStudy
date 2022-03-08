package com.grammar;

public class SwitchGrammar {
    public static void main(String[] args) {
        char a = 'B';
        switch (a) {
            case 'A':
                System.out.println("优秀");
            case 'B':
                System.out.println("良好");
                // 使用break跳出switch语句
                break;
            case 'C':
                System.out.println("及格");
        }
    }
}