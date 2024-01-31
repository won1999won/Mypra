package com.oghraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

        /*
        * [do-While문 표현식]
        * 초기식;
        * do{
        *    1회차에는 반드시 실행하고 이후에는 조건만족시 실행할 구문
        *    증감식;
        * } while(조건식);
        * */

    public void simpeldowhilesatement(){
        do{
           System.out.println("최초 1회동작");
        }while (false);
        System.out.println("반복종료");
    }
    public void testdowjilexample1(){
        /*스캐너로 문자열 입력밭아 반복출력
        * 이때,exit입력시 반복문 종료*/


            Scanner sc=new Scanner(System.in);
            String str="";
            do{
                System.out.println("문자열 입력");
                str= sc.nextLine();
                System.out.println(str);
                /*equals():문자열을 비교하는 기능제공*/
            }while (!str.equals("exit"));
            System.out.println("반복종료");

    }

    }



