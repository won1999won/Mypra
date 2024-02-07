package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {


        /*[super]
         * 자식클래스를 이용해서 객제를 생성할때 부모 생성자를 호출하여 부모클래스의 인스턴스도 함께 생성된다
         *이때 생성된 부모의 인스턴스주소를 보관하는 레퍼런스 변수로
         * 자식클래스내의 모든 생성자와 메소드 내에서 선언하징낳고 쓸수있다
         * [super()]
         * 부모생성자를 호출하는 구문으로 인자와 매개변수의 타입 갯수 순서가 일하는 부모의 생성자를 호출한다
         * this()가 해당 클래스내의 다른 생성자를 호출하는 구문이라면
         * super()는 부모클래스가 가지는 private생성자를 제외한 나머지 생성자를 호출할수있는 부분이다
         * */
        product product1 = new product();
        System.out.println(product1.getinfo());


        product product2= new product("s-01234","idk","svs",1000000, new java.util.Date());
        System.out.println(product2.getinfo());

    computer computer1=new computer();
        System.out.println(computer1.getinfo());

        computer computer2=new computer("esx",512,12,"ssss");

        System.out.println(computer2.getinfo());

        computer computer3 =new computer("1212","122222",1212,
        new java.util.Date(),"esx",512,12,"ssss");
        System.out.println(computer3.getinfo());

    }
}