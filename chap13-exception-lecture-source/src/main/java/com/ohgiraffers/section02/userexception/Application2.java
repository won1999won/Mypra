package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.Notenoughmoneyexception;
import com.ohgiraffers.section02.userexception.exception.moneynagertiveexception;
import com.ohgiraffers.section02.userexception.exception.pricenagertiveexception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et=new ExceptionTest();

        try {
            et.checkenoughmoney(2000,100000);
        } catch (Notenoughmoneyexception e) {
            System.out.println("Notenoughmoneyexception");
            System.out.println(e.getMessage());
        } catch (moneynagertiveexception e) {
            System.out.println("moneynagertiveexception");
            System.out.println(e.getMessage());
        } catch (pricenagertiveexception e) {
            System.out.println("pricenagertiveexception");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("종료");

    }
}
