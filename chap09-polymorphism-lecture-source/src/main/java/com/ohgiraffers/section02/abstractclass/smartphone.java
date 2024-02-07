package com.ohgiraffers.section02.abstractclass;

public class smartphone extends product{
    /*extends 키워드로 상속받을때 두개이상의 클래스는 상속하지않는다
    * 추상클래스가 가지는 추상메소드를 반드시 오버라이딩해야한다 */

    public smartphone(){}
    @Override
    public void abmet(){
        System.out.println("product 클래스의 abmet을 오버라이딩한 메소드 호출");
    }
    public void printsmp(){
        System.out.println("smartphone 클래스의 printsmp 메소드 호출");
    }
}
