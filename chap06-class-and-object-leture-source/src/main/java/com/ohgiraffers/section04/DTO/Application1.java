package com.ohgiraffers.section04.DTO;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 생성자를 이용한 초기화
        * 장점:setter메소드를 여러번 호출해서 사용하지않고 단 한번의 호출로 인스턴스를 생성 및 초기화 할수있다
        * 단점: 필드를 초기화 할 매개변수의 갯수를 경우의수 상관없이 모두 만들어야한다
        *            호출시 인자가 많아질경우 어떠한 값이 어떤 필드인지 보기 힘들다
        *
        * 설정자를 이용한 초기화
        * 장점:필드를 초기화 하는 각ㄱ가의 값들이 어떤 핃드를 초기화 하는지 명확하게 볼수있다
        * 단전 하나의 인스턴스를 생성할때 한번의 호출로 끝나지않는다*/


        /*생성자를 이용한 초기화*/
        userdto user1=new userdto("ogiraffers","ogiraffers","ogiraffers",new java.util.Date());
        System.out.println(user1.getinfo());
        /*기본 생성자와 설정자를 이용한 초기화*/
        userdto user2=new userdto();
        user2.setId("ogiffers");
        user2.setName("ogiffers");
        user2.setPsw("ogiffers");
        user2.setEnrolldata(new java.util.Date());
        System.out.println(user2.getinfo());
    }
}
