package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class userDTO implements HttpSessionBindingListener {

    private String name;
   private int age;
   private String gender;

    public userDTO() {
    }

    public userDTO(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "usetDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
//        해당 클래스로 생성한 인스턴스가 session에 바인딩되는 경우 동작
        System.out.println("valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
//        해당 클래스로 생성한 인스턴스가 세션에 바인딩이 해제되는경우 동작
        System.out.println("valueUnbound");
    }
}
