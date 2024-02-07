package com.ohgiraffers.section01.extend;

public class firecar extends car {


    public firecar() {
        super(); //부모의 기본 생성자 호출
        System.out.println("firecar 클래스 기본생성자 호출");


        /*
         * @override 어노테이션
         * 오버라이딩 성립요건을 체크하여 성립되지 않는경우 컵파일 에러를 발생시킨다
         * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야한다
         * */

//        @Override

//        public void soundhorn() {
//            if (isrunning()) {
//                System.out.println("쁘에에엥");
//            } else {
//                System.out.println("전진불가");
//            }
//
//
//
//        }
//        public void spraywater(){
//            System.out.println("물싸개 실시!");
    }

    }

