package com.ohgiraffers.section02.dimensional;

public class Application {
    public static void main(String[] args) {
//        /*다차원 배열
//         * 다차원 배열은 2차원 이상의 배열을 의미하며,배열의 인덱스 마다 또다른 배열의 주소를 보관하는 역할이다
//         * 즉,2차원 배열은 1차원 배열 여러개를 묶어 관리하는 배열이다
//         * 일반적으로 2 차원 배열 이상의 배열은 사용빈도가 현저히 적다
//         *
//         * 2차원 배열을 사용하는 방법
//         * 1.배열의 주소를 보관할 레버런스 변수 선언
//         * 2.여러개의 1차원 주소룰 관리할 배열 생성
//         * 2. 2에서 생성한 배열의 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
//         * 4.생성한 여러개의 1차원 배열에 접근해서 사용
//         * */
//        /*배열 주소를 보관할 래퍼런스 변수 선언*/
//
//        int iarr2[][];
//        int[] iarr3[] = new int[0][];
//
//        /*1. 여러개의 1차원 배열주소를 관리하는 배열생성*/
////        iarr1=new int[][]; //크기 미지정으로 오류남
//        iarr2 = new int[3][];
////        iarr3= new  int[][3]; // 주소를 묶어 관리할 배열의 크기를 지정하지않으면 에러
//        for (int i = 0; i < iarr2.length; i++) {
//            System.out.println(iarr2[i]);
//
//
//        }
//        /*3. 주소를 관리하는 배열의 인덱스마다 배열을 할당*/
//        /*정변배열:서로 같은 길이의 배열 여러개를 하나로 묶어 관리하는 2차원 배열
//         * 가변배열: 서로 길이다 가른 배열 여러개를 하나로 묶어 관리하는 2차원 배열
//         * */
//        iarr2[0] = new int[3];
//        iarr2[1] = new int[3];
//        iarr2[2] = new int[3];
//        iarr3[0] = new int[7];
//        iarr3[1] = new int[5];
//        iarr3[2] = new int[2];
//        for (int i = 0; i < iarr3.length; i++) {
//            System.out.println("iarr3의" + i + "번째 인덱스:" + iarr3[i].hashCode());
//            System.out.println("iarr3[" + i + "].length:" + iarr3[i].length);
//
//
//        }
//        int[][] iarr1;
//        iarr1 = new int[3][3];
//        int[][] iarr4 = new int[][]{{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
//        int iarr5[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] iarr6 = {{111, 222}, {333, 444, 555, 666, 777,}, {110, 223}};
//
//        /*미리 만든 1차원 배열로 대입할수있다*/
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {4, 5, 6};
//        int[] arr3 = {7, 8, 9};
//        int[] arr4 = {10, 11, 12, 13, 14, 15};
//        int[] arr5 = {20, 21};
//
//        int[][] iarr7 = {arr1, arr2, arr3};
//
//        for (int i = 0; i < iarr7.length; i++) {
//            for (int j = 0; j < iarr7[i].length; j++) {
//                System.out.println("iarr7[" + i + "][" + j + "]:" + iarr7[i][j]);
//
//
//            }
//
//
//        }
//        int[][] iarr8 = {arr3, arr4, arr5};
////        for (int i = 0; i < iarr8.length; i++)
//        {
////            for (int j = 0; j < iarr8[i].length; j++)
//            {
////                System.out.println("iarr8[" + i + "][" + j + "]:" + iarr8[i][j]);
//            }
//
//
//            /*생성한 여러개의 1차원배열에 접근해서 사용*/
//            iarr1 = new int[0][];
//            int[] i=arr1;
//            iarr1[0][0] = 1;
//            iarr1[0][1] = 2;
//            iarr1[0][2] = 3;
//
//            iarr1[1][0] = 4;
//            iarr1[1][1] = 5;
//            iarr1[1][2] = 6;
//            iarr1[2][0] = 7;
//            iarr1[2][1] = 8;
//            iarr1[2][2] = 9;
//            for (int i = 0; i < iarr1.length; i++) {
//                for (int j = 0; j < iarr1[i].length[i]; j++) {
//                   System.out.println(iarr1[i][j]);
//                }
//            }
//        }
//
//
 }
}

