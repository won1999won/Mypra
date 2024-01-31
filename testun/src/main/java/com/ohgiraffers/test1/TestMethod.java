package com.ohgiraffers.test1;
import java.util.Scanner;
public class TestMethod {

    public int Calculator(int a, int b) {
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
        return (as1+as2+as3+as4+as5);
    }
    public double CicArea () {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        double hf = sc.nextDouble();
        double asw = (pi * hf * hf);
        System.out.println("원의 부피는:" + asw);

         return asw;
    }
    public static double TestRandom () {

        int result = (int) (Math.random() * 10) + 1;
        System.out.println("난수값은:" + result);

        return result;
    }
}



