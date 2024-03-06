package com.hw1.model.dto;

public class Student extends Person {

    public Student() {
        super();
    }

    private int grade;
    private String major;


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }


    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        setName(name);
        this.grade = grade;
        this.major = major;
        System.out.println();
    }
    public String getinfo() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", major"+major+
                ",grade"+grade+
                '\'' +
                '}';


    }

    public String information() {
        return "이름: " + name + " 나이: " + getAge() + " 키: " + getHeight() +
                " 몸무게: " + getWeight() + " 학년: " + grade + " 전공: " + major;
    }



    }






