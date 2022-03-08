package com.animal;

public class Animal {
    String name;
    public Animal() {
        name = "Animal";
    }
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void run() {
        System.out.println(name + "正在跑");
    }
}
