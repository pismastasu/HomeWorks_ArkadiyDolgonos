package com.levelup.lesson2.tasks;

/**
 * Created by Алевтина on 24.07.2016.
 */
public class Student {
    private String name;
    private String sername;
    private String gender;
    private Integer age;

    public Student() {
    }

    public Student(String name, String sername, String gender, Integer age) {
        this.name = name;
        this.sername = sername;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
