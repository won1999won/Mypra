package com.greedy.level02.nomal.student.model.vo;

import java.util.Scanner;

public class StudentVO {
    private int grade;
    private int classroom;
    private String name;
    private double heigh;
    private char gender;

    public StudentVO() {

    }

    public StudentVO(int grade, int classroom, String name, double heigh, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.heigh = heigh;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String getName() {
        return name;
    }

    public int getClassroom() {
        return classroom;
    }

    public char getGender() {
        return gender;
    }

    public double getHeigh() {
        return heigh;
    }

    public void printInformation(Scanner scc) {
        System.out.println("이름:");
        this.name = scc.nextLine();
        System.out.println("학년:");
        this.grade = scc.nextInt();
        System.out.println("반:");
        this.classroom = scc.nextInt();
        System.out.println("성별:");
        this.gender = scc.next().charAt(0);
        System.out.println("키:");
        this.heigh = scc.nextDouble();
        System.out.println("==========");
        System.out.println("이름:" + name);
        System.out.println("학년:" + grade);
        System.out.println("반:" + classroom);
        System.out.println("성별:" + gender);
        System.out.println("키:" + heigh);
    }
}

