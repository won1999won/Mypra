package com.ohgiraffers.test1;
import java.util.Scanner;
public class TestMethod {

    public String Calculator(int a, int b) {
        int as1 = (a += b);
        System.out.println("두수를 더한값은" + as1);
        int as2 = (a /= b);
        System.out.println("두수를 나눈값은" + as2);
        int as3 = (a %= b);
        System.out.println("두수를 나눈 나머지값은" + as3);
        int as4 = (a *= b);
        System.out.println("두수를 곱한 값은" + as4);
        int as5 = (a - b);
        System.out.println("두수를 뺀값은" + as5);
        return "종료";
    }
    public double CicArea () {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름입력:");
        double hf = sc.nextDouble();
        double asw = (PI * hf * hf);

         return asw;
    }
    public static int TestRandom () {

        int result = (int) (Math.random() * 10) + 1;

        return result;
    }
}



