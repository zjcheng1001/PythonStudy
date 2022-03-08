package com.animal;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }
    public Dog(String name) {
        super(name);
    }
    public void eat(String name) {
        System.out.print("名字: " + name + " ");
        super.eat();
    }

    public static void main(String[] args) {
        Dog d = new Dog("狗");
        d.eat();
        d.eat("小黑");
    }
}
