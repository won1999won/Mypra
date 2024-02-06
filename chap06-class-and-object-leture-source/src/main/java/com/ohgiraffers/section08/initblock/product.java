package com.ohgiraffers.section08.initblock;

public class product {

    /*필드를 초기화 하지 않으면JVM이 정한 기본값으로 객체생성*/
//    private  String name;
//    private  int price;
//
//    private static String brand;
    /*명시적 초기화*/
    private String name="ff";
    private  int price=10000;
    private static String brand="응애";
    /*인스턴스 초기화 블럭 필드 초기화*/
    {
        name="으애";
        price=1700;
        brand="몰루";
        System.out.println("인스턴스 초기화 블럭동작");
    }
    static {
        /*스태틱 초기화 블럭에서는 비 스테틱 필드를 초기화 하지 못한다
        * 정적 초기화 블럭은 클래스 로드시에 동작한다
        * 따라서 정적 초기화 블럭의 동작시점에는 인스턴스가 존재하지 않기에
        * 존재하지 않는 인스턴스변수를 초기화하는것은 시기상 불가능하다*/
//        name="히에";
//        price=1808;
        brand="집가고싶어";
        System.out.println("정적 초기화 블럭작동");
    }
    public product(){
        System.out.println("기본생성자 호출");
    }
    public product(String name,int price,String brand){
        this.name=name;
        this.price=price;
        product.brand=brand;
        System.out.println("매개변수 생성자 호출");
    }

    public String getinfomation(){
        return "product [name="+this.name+",price"+this.price+",brand"+product.brand+"]";
    }
}
