package com.oghraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /*while문 표현식
     * 초기식
     * while(조건식){
     *      조건만족시 반복수행할구문;
     *      중감식;
     * }
     * */


    public void wimplewhilestatement() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;


            }

    }public void whilex2(){
        /*정수하나를 입력받아 1부터 입력정수까지의 합*/
        Scanner sc=new Scanner(System.in);
        System.out.println("정수입력:");
        int num= sc.nextInt();

        int i=1;
        int sum=0;
        while (i<=num){
            sum+=i;
            i++;
        }
        System.out.println("1부터 입력밭은 정수까지의 합="+num+sum);
    }
    public void wheliex3(){
        int dan=2;
        while (dan<10){
            int su=1;
            while (su<10){
                System.out.println(dan+"*"+su+"="+(dan*su));
                su++;
            }
            System.out.println();
            dan++;
        }
    }
}
