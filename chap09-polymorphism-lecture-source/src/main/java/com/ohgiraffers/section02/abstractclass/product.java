package com.ohgiraffers.section02.abstractclass;

public abstract class product {

    private int nonsta;
    private static int statc;

    public product(){
    }
    public void nonstamet()

    {


        System.out.println("프로덕트 클래스 논 스태틱필드 호출");

    }
    public static void staticmat(){
        System.out.println("스태틱호출");
    }
    public abstract void abmet();

    }


