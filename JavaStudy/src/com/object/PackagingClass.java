package com.object;

/**
 * 类的封装
 */
class PersonPackaging {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    /**
     * 验证类的属性
     * @param age 设置的年龄
     */
    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            System.out.println("年龄不在范围内。");
            this.age = 18;
        } else {
            this.age = age;
        }
    }
}

public class PackagingClass {
    public static void main(String[] args) {
        PersonPackaging p = new PersonPackaging();
        p.setName("张三");
        p.setAge(-10);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
