package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /*인터페이스
        * 자바의 클래스와 유사한 형태지만
        * 추상메소드와 상수필드만이 가질수있는 클래스의 변형체를 의미
        *
        *
        * 인터페이스의 목적
        * 1.추상클래스처럼 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용(표준화)
        * 2.자바의 단일상속의 단점이 사라짐(다중상속)
        * */

        /*인스턴스를 생성하지 못하고 생성자 자체만 존재하지않는다*/
//        interproduct interproduct=new interproduct();
        /*레퍼런스 타입만 사용이 가능하다*/
        interproduct interproduct=new product();

        /*인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출됨*/
        interproduct.nons();
        interproduct.abstm();

        /*오버라이딩을 하지않으면 인터페이스의 디폴드 메소드로 호출됨*/
        interproduct.defoltmethod();

        /*스태틱메소드는 인터페이스명.메소드명();으로 호출함*/
        com.ohgiraffers.section03.interfaceimplements.interproduct.staticmethod();

        /*상수 필드접근보 인터페이스명.필드명()으로 접근함*/
        System.out.println(com.ohgiraffers.section03.interfaceimplements.interproduct.max_mun);
        System.out.println(com.ohgiraffers.section03.interfaceimplements.interproduct.min_num);
    }
}
