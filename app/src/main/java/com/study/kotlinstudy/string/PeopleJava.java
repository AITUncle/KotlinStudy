package com.study.kotlinstudy.string;

public class PeopleJava {
    private String name;
    private int age;

    public PeopleJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PeopleJava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
