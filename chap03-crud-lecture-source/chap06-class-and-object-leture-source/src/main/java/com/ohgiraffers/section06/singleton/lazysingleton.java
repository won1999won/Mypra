package com.ohgiraffers.section06.singleton;

public class lazysingleton {

    /*클래스가 초기화 되는 시점에 필드를 선언해두고 null로 초기화한다*/
    private static lazysingleton lazy;

    private lazysingleton(){}

    public static lazysingleton getInstance(){
        if (lazy==null){
            lazy=new lazysingleton();
        }
        return lazy;
    }
}
