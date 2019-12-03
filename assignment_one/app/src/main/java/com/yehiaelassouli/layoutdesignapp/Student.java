package com.yehiaelassouli.layoutdesignapp;

public class Student {

    String name;
    String age;
    String level;
    float degree;

    public Student( String name, String age, String level, float degree) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.degree = degree;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getDegree() {
        return degree;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }
}
