package com.ohgiraffers.section04.constructor;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 클래스명 변서명=new 클래스명();
        * 클래스명 레퍼런스변수=new 생성자();
        *
        *
        * 생성자란
        * 인스턴스를 생성할때 초기수행할 명령이있는경우 미리 작성해두고 인스턴스를 생성할때 호출된다
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자라하며
        * 기본생성자는 컴파일러에의해 자동으로 추가되기에 지금까지 명시하지않았다
        * (인스턴스 생성시 별도로 수행할 명령이 없었기에 작성하지 않았음)
        * */

        user user1=new user();
        System.out.println(user1.getinfo());

        user user2=new user("user01","u1102","aaa");
        System.out.println(user2.getinfo());

        user user3=new user("aaaaa","1231231","meow",new java.util.Date());
        System.out.println(user3.getinfo());


    }
}
