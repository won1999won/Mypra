package org.test;
import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 입력:");
        String juMin = sc.nextLine();
        char[] ary = juMin.toCharArray();
        for (int i = 8; i < juMin.length(); i++) {
            ary[i] = '*';
        }
        System.out.print("주민번호는:");
        for (int x = 0; x < juMin.length(); x++) {
            System.out.printf("" + ary[x]);
            {
            }
        }
    }
}