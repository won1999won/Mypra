package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price,int money)throws Exception{
        System.out.println("소지금:"+money);
        if (money>=price){
            System.out.println("구매성공");
        }else {
            throw new Exception();
        }
        System.out.println("이이");
    }
}
