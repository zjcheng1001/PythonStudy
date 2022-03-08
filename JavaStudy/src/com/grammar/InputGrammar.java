package com.grammar;

import java.util.Scanner;

public class InputGrammar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("当前输入的名字是: " + name);

        System.out.println("How old are you? ");
        int age = input.nextInt();
        System.out.println("当前输入的年龄是: " + age);

        System.out.println("人员: " + name + " 当前年龄是: " + age);

    }
}
