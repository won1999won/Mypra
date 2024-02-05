package org.test;
import java.util.Scanner;



    public  class test1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] a = {"apple", "peach", "banaan", "kiwi", "stoberry"};
            System.out.print("in put");
            int i = sc.nextInt();
            if (i < a.length&& i >= 0) {
                System.out.printf("선택한건"+a[i]);



            } else {

                System.out.print("no prt");
            }


        }


    }

