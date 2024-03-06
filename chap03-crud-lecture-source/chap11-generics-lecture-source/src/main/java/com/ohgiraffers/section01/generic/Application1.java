package com.ohgiraffers.section01.generic;

public class Application1 {
    public static void main(String[] args) {
        /*제네릭
        * 제네릭의 사전적 의미는 일반적인 이다
        * 자바에서 제네릭이란 데이터의 타입을 일반화 한다는 의미
        *
        * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법
        * 컴파일시에 미리 타입검사를 하므로 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일수있다
        * 잘못된 다입은 컴페일 에러를 만든다
        * 따라서 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다
        *
        * 제네릭 ㅍ로그래밍
        * 데이터 형식에 의존하지않고 하나의 값이 여러 다른 데이터 타입을 가질수있는 기술에 중점을 두어
        * 재사용성을 높일수있는 프로그래밍방식*/


        generictest<Integer> gt1=new generictest<Integer>();

        gt1.setValue(10);
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        generictest<String> gt2=new generictest<String>();
        gt2.setValue("졸려");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        generictest<Double> gt3=new generictest<>();

        gt3.setValue(0.3);
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }
}
