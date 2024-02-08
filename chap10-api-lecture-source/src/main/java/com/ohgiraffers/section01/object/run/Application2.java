package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.book;

public class Application2 {
    public static void main(String[] args) {


        /*
         *equals()메소드 오버라이딩
         * 이퀄즈 메소드는 매개변수로 전달받은 인스턴스와 ==연산하여  참과 거짓을 ㅂ나환한다
         * 즉 동일 인스턴스인지 구분한다
         *
         * 동일객체:주소가 동일한 인스턴스를 동일객체라 한다
         * 동등객체:다른 ㅈ소레 필드값이 같은 객체를 동등객체라한다
         * */

        book book1 = new book(1, "veve", "aru", 9999);
        book book2 = new book(1, "veve", "aru", 9999);

        System.out.println("두 인스턴스 연산비교==:"+(book1==book2));
        System.out.println("두 인스턴스 이퀄즈비교==:"+(book1.equals(book2)));
    }


}
