package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /*try-catch 블럭을 이용한 예외처리*/

        ExceptionTest et=new ExceptionTest();

        try {


            et.checkEnoughMoney(100000, 5000);
            System.out.println("구입");
        } catch (Exception e) {
            System.out.println("=======불가======");
        }
        System.out.println("종료");
    }
}
