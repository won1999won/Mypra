package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {

        int a=100;
        double b=200.2;
        long c=100000;
        float d=10.1f;
        byte e=1;
        short f='f';
        boolean g=true;
        String h="결과값";
        int last= (int) (a+b+c+e+d+f);


        String ex=(last>=0)? "양수":"음수";

        System.out.println(ex);
    }





}
