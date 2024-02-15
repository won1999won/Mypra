package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.Notenoughmoneyexception;
import com.ohgiraffers.section02.userexception.exception.moneynagertiveexception;
import com.ohgiraffers.section02.userexception.exception.pricenagertiveexception;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkenoughmoney(5000000, 3000);
//            et.checkenoughmoney(-5000000, 3000);
//            et.checkenoughmoney(-5000000, -3000);
            et.checkenoughmoney(3000,900000);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
