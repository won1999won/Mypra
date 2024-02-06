package com.ohgiraffers.section06.statickeyword;

public class staticmethodtest {


    private int count;

    public void nonstaticm(){
        this.count++; //인스턴스 생성후 사용가능한 메소드이기때문에 this에 주소가 들어있다
        System.out.println("nonsm 호출");
    }
    public static void staticm(){
//        this.count++; //인스턴스를 생성하지않고 사용하는 메소드이기에 this에 주소가 들어갈수없다

        System.out.println("sm 호출");

        /*비 스태틱 메소드 호출*/
        staticmethodtest smt=new staticmethodtest();
        smt.nonstaticm();
        /*스태틱 메소드 호출*/
        smt.staticm(); //비권장

        staticmethodtest.staticm();//권장
    }
}
