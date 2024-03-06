package com.ohgiraffers.section05.Parameter;

public class Application1 {
    public static void main(String[] args) {

        /*매개변수로 사용가능한 자료형
        * 1.기본자료형
        * 2.기본자료형 배열
        * 3.클래스 자료형(사용자 정의 자료형)
        * 4.클래스 자료형 배열(=객체배열)
        * 5.가변인자*/


        parametertest para=new parametertest();
        int num=20;

        para.primarytypepayameter(num);


        int[] iarr=new int[]{1,2,3,4,5};
        System.out.println("기본자료형 배열 전달인자로 전달하는값:"+iarr);
        para.primarytypearrayparameter(iarr);

        System.out.println("변경 이후값:");
        for (int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();

        Ractangle r1=new Ractangle();

        System.out.println("전달값:"+r1);
        para.classtypeparameter(r1);

        System.out.println("변경후 사각형의 넓이둘레");
        r1.calcarea();
        r1.calcraund();

        para.variable("aaa");
        para.variable("bbb","wwww");
        para.variable("bbb","wwww","eeeee","qqqqq");
        para.variable("bbb",new String[]{"dddd","tttt","gggg"});
    }


    }


