package com.ohgiraffers.section02.solution;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수입력");
        int x = sc.nextInt();
        Random random = new Random();
        int randomNb = random.nextInt(100) + 1;
        int loop = 1;
        for (; ; ) {

            if (x == randomNb) {
                System.out.println(loop + "번만에 맞추셧습니다");
                break;
            }
            if (x > randomNb) {
                System.out.println("정수가 난수보다 큽니다");
                System.out.println("생성난수");
                System.out.println(randomNb);
                System.out.println("정수재입력");
                x = sc.nextInt();
                loop += 1;
            }
            if (x < randomNb) {
                System.out.println("정수가 난수보다 작습니다");
                System.out.println("생성난수");
                System.out.println(randomNb);
                System.out.println("정수재입력");
                x = sc.nextInt();

                loop += 1;
            }
        }

//        System.out.println("정수입력");
//        int x = sc.nextInt();
//        Random random = new Random();
//        int randomNb = random.nextInt(100) + 1;
//        int loop = 1;
//        for (; ; ) {
//
//            if (x == randomNb) {
//                System.out.println(loop + "번만에 맞추셧습니다");
//                break;
//            }
//            if (x > randomNb) {
//                System.out.println("정수가 난수보다 큽니다");
//                System.out.println("생성난수");
//                System.out.println(randomNb);
//                int randomNb = random.nextInt(100) + 1;
//                loop += 1;
//            }
//            if (x < randomNb) {
//                System.out.println("정수가 난수보다 작습니다");
//                System.out.println("생성난수");
//                System.out.println(randomNb);
//                int randomNb = random.nextInt(100) + 1;
//
//                loop += 1;
//            }

        }

    }









