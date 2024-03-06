package com.ohgiraffers.section01.polymorphism;

public class cat extends animal{

    @Override
    public void eat(){
        System.out.println("생성냠");
    }
    @Override
    public void run(){
        System.out.println("냥리기");
    }
    @Override
    public void cry(){
        System.out.println("왜오오오오옹");
    }
    public void jump(){
        System.out.println("냥푸");
    }
}
