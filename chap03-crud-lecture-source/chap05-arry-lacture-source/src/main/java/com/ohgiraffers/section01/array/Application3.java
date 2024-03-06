package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {


        /*전수의 합계와 형균 구하기
         * 1.길이가 5인 정수형 배열을 만든다
         * 2.Scanner를 이용하여 학생 5명의 java 시험 점수를 입력받아 만든배열에 저장한다
         * 3.배열에 저장한 점수의 함계(int)와평균(double)을 구하여 출력한다
         * */

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println((i+1)+"번째 학생의 점수입력");
            scores[i] = sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        /*향상된 for 문
        * for(int i:scores){
        *         sum+=i;
        * }
        * */
        double avg=(double)sum/scores.length;
        System.out.println("합계:"+sum+"점");
        System.out.println("평균:"+avg+"점");


    }
}
