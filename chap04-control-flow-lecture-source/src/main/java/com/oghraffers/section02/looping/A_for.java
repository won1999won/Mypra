package com.oghraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    /*for문 표현식
     * 랙(초기식(1순);조건식(2순);증감식(4순);){
     *    조건을 만족시 반복할 구문(3순)
     * }
     * */
    public void simpleforstatement() {

        /*1부터 10까지 1씩 증가시키면서 i값을 10까지 출력한다*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);


        }


    }

    public void testforexample() {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("입력");
//        String menu1= sc.nextLine();
//        System.out.println(menu1+"1순위선택");
//
//        System.out.println("입력");
//        String menu2= sc.nextLine();
//        System.out.println(menu2+"2순위선택");
//
//        System.out.println("입력");
//        String menu3= sc.nextLine();
//        System.out.println(menu3+"3순위선택");
//
//        System.out.println("입력");
//        String menu4= sc.nextLine();
//        System.out.println(menu4+"4순위선택");
//
//        System.out.println("입력");
//        String menu5= sc.nextLine();
//        System.out.println(menu5+"5순위선택");
//
//        System.out.println("입력");
//        String menu6= sc.nextLine();
//        System.out.println(menu6+"6순위선택");
//
//        System.out.println("입력");
//        String menu7= sc.nextLine();
//        System.out.println(menu7+"7순위선택");
//
//        System.out.println("입력");
//        String menu8= sc.nextLine();
//        System.out.println(menu8+"8순위선택");
//        System.out.println("입력");
//        String menu9= sc.nextLine();
//        System.out.println(menu9+"9순위선택");
//
//        System.out.println("입력");
//        String menu10= sc.nextLine();
//        System.out.println(menu10+"10순위선택");
//
//        for (int i=1;i<=10;i++){
//            System.out.println("메뉴입력");
//            String menu=sc.nextLine();
//            System.out.println("밥먹고싶다");
//
//
//        }
//    }
//
//    public void testex2(){
//        int num1=1;
//        int num2=2;
//        int num3=3;
//        int num4=4;
//        int num5=5;
//        int num6=6;
//        int num7=7;
//        int num8=8;
//
//
//        int sum=0;
//
//        sum+= num1; //sum=sum+num1
//        sum+= num2; //3
//        sum+= num3; //6
//        sum+= num4; //10
//        sum+= num5; //15
//        sum+= num6; //21
//        sum+= num7; //28
//        sum+= num8; //36
//
//
//        System.out.println("sum"+sum);

//        int sum2 = 0;
//        for (int i = 1; i <= 8; i++) {
//            sum2 += i;
//
//        }
//        System.out.println("sum2" + sum2);

    }

    public void testforexmple3() {
        int ramdom = (int) (Math.random() * 6) + 5;
        System.out.println("radom:" + ramdom);

        int sum = 0;

        if (ramdom == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if (ramdom == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;

        } else if (ramdom == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;


        } else if (ramdom == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;


        } else if (ramdom == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("sum" + sum);


        int sum2 = 0;
        for (int i = 1; i <= ramdom; i++) {
            sum2 += i;
        }
        System.out.println("1부터" + ramdom + "의 함:" + sum2);
    }

    public void test4() {
        /*
         * 1.scanner를 이용하며 두개의 정수를 입력한다
         *         (단, 두숫자는 같은 숫자를 입력하지 않는다는 가정)
         * 2.입력된 두 수중,작은수부터 큰수까지의 합을 구한다
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("1정수입력:");
        int fNum = sc.nextInt();
        System.out.println("2정수입력:");
        int sNum = sc.nextInt();

        int sum = 0;


        /*fnum이 더 큰경우*/
        if (fNum > sNum) {
            for (int i = sNum; i <= fNum; i++) {
                sum += i;
            }
        } else {
            for (int i = fNum; i <= sNum; i++) {
                sum += i;
            }
        }
        System.out.println("sum" + sum);
        int sum2 = 0;
        int max = Math.max(fNum, sum);
        int min = Math.min(fNum, sum);

        for (int i = max; i >= min; i--) {
            sum2+=i;

        }
        System.out.println("sum2"+sum2);
    }
}
