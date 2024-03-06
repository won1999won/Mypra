package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.book;

public class Application3 {
    public static void main(String[] args) {
        /*
        * hachcode()메소드 오버라이딩
        * object클래스의 명세에 작성된 일반규약에따라
        * 이퀄즈()메소드를 재정의 하는 경우 반드시 헤쉬코드()메소드도 재정의 하도록 되어있다
        * 만약 재정의 하지않으면 같은 값을 가지는 동등객체는
        * 같은 해시코드값을 가져야 한다는 규칙에 위반함(강제성은 없다)*/

        book book1=new book(1,"2222","dw",123);
        book book2=new book(1,"2222","dw",123);


        System.out.println("book1 해쉬:"+book1.hashCode());
        System.out.println("book2 해쉬:"+book2.hashCode());

    }
}
