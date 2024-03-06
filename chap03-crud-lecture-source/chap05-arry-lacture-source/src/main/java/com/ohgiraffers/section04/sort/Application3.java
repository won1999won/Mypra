package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 버블정렬
        * 인접한 두개의 원소를 검사하여 정렬하는 방법
        * 구현이 쉽다는 장점이있다,하지만 다른정렬에 비해 정렬속도가 느리며
        * 역순정렬시 가장 느린속도를 가진다*/

        int[] arr={1,6,2,5,3,7};

        int temp;

        for (int i= arr.length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }

}
