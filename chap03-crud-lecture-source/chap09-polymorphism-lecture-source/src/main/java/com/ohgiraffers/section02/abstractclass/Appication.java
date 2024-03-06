package com.ohgiraffers.section02.abstractclass;

public class Appication {
    public static void main(String[] args) {

        /*
        * 추상클래스와 추상메소드
        * 추상메소드를 0개 이상 포함하는 클래스를 추상클래스라한다
        * 추상클래스는 클래스 선언부에 abstrasct키워드를 명시해야한다
        * 추상클래스로는 인스턴스를 생성할수없다
        * 추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야한다
        * 이때 추상클래스는 상위타입으로 사용될수있으며 다향성을 이용할수있다
        *
        * 추상클래스를 상속받아 구현할때는 extends 키워드를 사용하며
        * 자바에서는 extends 로 클래스를 상속받을시 하나의 부모 클래스만 가질수있다
        *
        *
        * 추상 메소드
        * 메소드의 선언부만있고 구현부가 없는 메소드를 추상 메소드라 한다
        * 추상메소드인경우 반드시 abstract키워드를 메소드 헤드에 작성해야한다
        * 예)public abstract void method();
        * */

        smartphone smartphone=new smartphone();
        System.out.println(smartphone instanceof smartphone);
        System.out.println(smartphone instanceof product);

        /*다형성 적용 추상클래스를 레퍼런스 타입으로 활용*/
        product product=new smartphone();
        /*동적바인딩에 의해 스마트폰 메소드 호출*/
        product.abmet();

        product.nonstamet();
        /*static 메소드는 그냥 사용가능(인스턴스생성 불필요*/
        product.staticmat();
    }
}




