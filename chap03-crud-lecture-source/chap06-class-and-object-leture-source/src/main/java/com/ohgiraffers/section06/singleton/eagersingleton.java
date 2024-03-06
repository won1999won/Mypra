package com.ohgiraffers.section06.singleton;

public class eagersingleton {
    /*클래스가 초기화 되는 시점에서 인스턴스를 생성한다*/
    private static eagersingleton eager=new eagersingleton();


    /*싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는것을 제한한다*/
    private eagersingleton(){}

    public static eagersingleton getInstance(){
        return eager;
    }
}
