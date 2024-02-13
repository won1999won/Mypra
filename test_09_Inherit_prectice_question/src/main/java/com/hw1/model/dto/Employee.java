package com.hw1.model.dto;

public class Employee extends Person{

    private int salary;
    private String dept;


    public Employee(){}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';

    }

    public Employee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    }

