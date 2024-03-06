package com.ohgiraffers.section03.interfaceimplements;

public class product extends Object implements interproduct,java.io.Serializable{
   /*클래스에서 인터페이스를 상속받을때에서는 implements키워드를 사용한다
   * 또한 인터페이스에서는 여러개를 상속박을수있으며
   * extend로 다른클래스를 상속받는경우에소 별개로 인터페이스에도 추가상속이 다능하다
   * 단,반드시 extends키워드가 implements보다 앞에가야한다*/



    @Override
    public void nons() {

    }

    @Override
    public void abstm() {
        System.out.println("인터페이스프로덕트의 abstm 오버라이딩한 호출");

    }

    /*스태틱 메소드는 오버라이딩 할수없다*/
//    @Override
//    public static void staticmt(){}
    /*디폴트 메소드는 인터페이스에서만 작성가능하며 디폴트 제거시 작성가능*/



    @Override
    public void defoltmethod() {
        System.out.println("프로덕트 클래스의 디폴트메소드 호출");
    }
}
