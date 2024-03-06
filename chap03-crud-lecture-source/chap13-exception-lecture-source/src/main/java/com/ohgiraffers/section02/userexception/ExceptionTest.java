package com.ohgiraffers.section02.userexception;
import  com.ohgiraffers.section02.userexception.exception.pricenagertiveexception;
import  com.ohgiraffers.section02.userexception.exception.Notenoughmoneyexception;
import com.ohgiraffers.section02.userexception.exception.moneynagertiveexception;
public class ExceptionTest {

    public void checkenoughmoney(int price,int money)throws pricenagertiveexception,moneynagertiveexception,Notenoughmoneyexception{



        if (price<0){
            throw new pricenagertiveexception("음수입니다");
        }
        if (money<0){
            throw new moneynagertiveexception("음수입니다");
        }
        if (money<price){
            throw new Notenoughmoneyexception("소지금 부족");
        }
        System.out.println("결제완료");

    }
}
