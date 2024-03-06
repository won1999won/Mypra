package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.book;

public class Application1 {
    public static void main(String[] args) {
        /*코든 클래스는 오브젝트 클래스의 후콘이다
        * 따라서 오브젝ㄱ트 클래스가 가진 메소드를 자신의 것으로쓸수있다
        * 또한 부보클래스가 가지는 메소드를 오버라이딩해서 사용하는것도 가능하다
        * */
        book book1=new book(1,"gggg","dd",1222222);
        book book2=new book(2,"qqqq","bb",123123);
        book book5=new book(2,"qqqq","bb",123123);
        book book3=new book(3,"hhhh","cc",1244442);
        book book4=new book(4,"vvvv","xx",66626222);

        /*동일한 값을 인스턴스도 다른 헤시코드를 가지고있다
        * 풀클래스이름과@그리고 16진수 래시코드를 반환한다*/
        System.out.println("book.tostring()"+book1.tostring());
        System.out.println("book.tostring()"+book2.tostring());
        System.out.println("book.tostring()"+book3.tostring());

        /*toString을 호출하지않고 레퍼런스변수만 출력하는 경우에도 동일하게 결과가 나온다
        * 이경우 자동으로 호출한다
        * 이점을 이용해 tostring메소드를 재정의 해서 사용한다*/
        System.out.println("book1"+book1);
        System.out.println("book2"+book2);
        System.out.println("book3"+book3);
    }
}
