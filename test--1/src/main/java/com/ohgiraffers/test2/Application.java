package com.ohgiraffers.test2;
import com.ohgiraffers.test1.TestMethod;

public class Application {
    public static void main(String[] args) {
        TestMethod tm=new TestMethod();
        System.out.println(tm.Calculator(13,13));

        System.out.println("원의 부피는"+tm.CicArea());

        System.out.println("난수값은"+TestMethod.TestRandom());


    }
}
