package com.oghraffers.section02.looping;

import java.util.Scanner;

public class A_nestdeFor {

    /*중첨for문
    * for문안에서 for문을 이용할수있다*/

    public void printgugudanfromtwotonine(){
        for (int dan=2;dan<=9;dan++){

            for (int su=1;su<= 9;su++){

                System.out.println(dan+"*"+su+"="+(dan*su));
            }
            System.out.println();
        }


    }
    public void printstarinputrowtime(){
        /*키보드로 정수를 하나 입력밭아 해당정수만큼 한행에"*"을5개출력*/
//        Scanner sc=new Scanner(System.in);
//        System.out.println("출력행수등장:");
//        int row= sc.nextInt();

//        for (int i=1;i<=row;i++)
        {
//            for (int j=1;j<6;j++)
            {
//                System.out.print("*");
            }
//            System.out.println();
        }
    }


    public void printstar(int times){
        for (int i=1;i<=times;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}


