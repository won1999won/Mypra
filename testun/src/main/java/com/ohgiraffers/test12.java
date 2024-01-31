package com.ohgiraffers;

import java.util.Scanner;

public class test12 {
    public static <duble> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력:");
        int age = sc.nextInt();
        String string = "";

        if (age >= 19) {
            string = "판매가능합니다";
        } else {
            string = "주스나 먹어라 꼬맹이";
        }
        System.out.println(string);

        System.out.println("=======");

        System.out.println("당첨번호");
        int number = sc.nextInt();
        if (number>=11&&number>0) {
            System.out.println("당첨번호는 1~10사이에만있다");

        }else if (number % 2 == 0) {
                System.out.println("짝수니 인형줄게");
            } else if (number % 2 != 0) {
                System.out.println("홀수니 모자줄게");
            } else {
            System.out.println();
            }
        System.out.println("=========");
        System.out.print("미소 점수 입력:");
        int smi=sc.nextInt();
        System.out.print("서비스 점수 입력:");
        int svs= sc.nextInt();
        System.out.print("성실 점수 입력:");
        int good= sc.nextInt();
        int all=((good+smi+svs)/3);
        if (smi<=39){
            System.out.println("미소점수 불합격");
        }else if (svs<=39){
            System.out.println("서비스 점수 불합격");
        }else if(good<=39){
            System.out.println("성실점수 불합격");
        }else if (all<=59){
            System.out.println("평균점수 불합격");
        }else{
            System.out.println("합격입니다");
        }
        System.out.println("급여입력:");
        int pay=sc.nextInt();
        System.out.println("매출입력:");
        int price= sc.nextInt();
        double bonus=0.0;

        if (price>50000000){
           bonus= price*0.05;


        } else if (price<50000000&&price>29999999) {
             bonus=price*0.03;
            
            
        } else if (price<29999999&&price>9999999) {
             bonus=price*0.01;
            
        }else {
             bonus=price*0.0;
        }
        int allpay= (int) (pay+(price*bonus));
        System.out.print("매출액:"+price);
        System.out.println("급여:"+pay);
        System.out.println("보너스:"+bonus);
        System.out.println("총급여:"+allpay);

        System.out.println("=============");

        System.out.println("정수를 입력");
        int aa=sc.nextInt();
        int som=0;
        for (int i=1;i<=aa;i++){
            if(i%2==0){
                som=som+i;
            }
        }
        System.out.println("1부터"+aa+"까지의 합계는:"+som);
        System.out.println("==========");
        System.out.println("정수입력");
        int lo=sc.nextInt();
        for (int i=1;i<=lo;i++){
            if (i%2==0){
                System.out.print("토");

            }else{
                if (i%2!=0){
                    System.out.print("마");
                }
            }
        }






    }






    }


