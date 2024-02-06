package com.ohgiraffers.section07.kindsofvariable;

public class kindsOfvariable { //클래스의 시작

    /*필드==전역변수(클래스전역에서 사용가능한 변수)==멤버변수(클래스가 가지는 멤버)
    * */


    /*비 스테틱 필드를 인스턴스 변수라고 한다*/

    private int globalnum;
    /*스태틱 필드를 정적 필드(클래스 변수)라고 한다 클래스 영역에 생성되는 변수*/

    private static int stasicnum;

    public void testme(int num){ //메소드 시작
        /*
        * 메소드의 괄호 안에 선언하는 변수를 매개 변수라고 한다
        * 메소드의 영역에서 작성되는 변수를 지역변수라 한다
        * 매개변수도 일종의 지역변수로 생각 하면 된다*/

        System.out.println(num);//매개변수는 호출시 값이 넘어와서 변경되기에 초기화 필요가없다
//        System.out.println(localnum); //지역변수는 선언외에 다시 호출하기 위해서는 반드시 초기화가 필요하다
        System.out.println(globalnum); //전역변수는 클래스 전역에서 사용가능하다
        System.out.println(stasicnum); //
    }
    public void testme2(){
//        System.out.println(localnum); //지역변수는 해당 지역내에서만 사용가능하다
        System.out.println(globalnum);  //전역변수는 다른 메소드에서도 사용가능하다
        System.out.println(stasicnum);
    }
    //클래스의 끝
}
