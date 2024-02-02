package com.ohgiraffers.section04.sort;

public class test1 {
    public static void main(String[] args) {
        int[] a={1,6,9,2,4,5,8,7};
        int temp;

        for (int i=a.length-1;i>=0;i--){
            for (int j=0;j<i;j--){
                if(a[j]>a[j+1]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }

        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[   i]);
        }
    }
}
