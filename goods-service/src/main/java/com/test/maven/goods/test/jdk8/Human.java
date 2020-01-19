package com.test.maven.goods.test.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @SuppressWarnings("serial")
    public static List<Human> getAInitHumanList() {
        return new ArrayList<Human>() {
            {
                add(new Human("guorao", 10));
                add(new Human("mako", 12));
                add(new Human("hel", 30));
                add(new Human("lin", 28));
            }
        };
    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge();
    }

}
