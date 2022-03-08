package com.grammar;

public class ForEnhanceGrammar {
    /**
     * for (声明语句: 表达式)
     * {
     *     语句
     * }
     * 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配
     * 表达式：是要访问的数组名，或者是返回值为数组的方法
     */
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
