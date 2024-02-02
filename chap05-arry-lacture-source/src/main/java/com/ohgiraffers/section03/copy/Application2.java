package com.ohgiraffers.section03.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 깊은 복사
        * 깊은 복사는 heap에 생성된 배열이 가진 값을 또다른 배열에 복사하는 것이다
        * 서로 같은 값을 가지고있지만 heap영역에 각각 다르게 생성된 배열이므로
        * 하나의 배열의 값을 변경해도 다른 값엔 영향을 주지않는다
        *
        *
        * 깊은 복사를 하는 방법 4가지
        * 1.for문을 이용하여 동일한 인덱스 값 복사
        * 2.ㅐobject와clone()을 이용한 복사
        * System의 arraycopy()를 이용한 복사
        * 4.Arrays의 copyof()를 활용한 복사
        * */

        int[] originarr=new int[]{2,3,5,6,};

        /*for문을 이용하여 인덱스 값 복사*/
        int[] copyfor=new int[originarr.length];
        for (int i= 0;i<originarr.length;i++){
            copyfor[i]=originarr[i];
        }
        print("copyfor",copyfor);

        /*Object의 clone()이용한 복사*/
        int[] copyclone=originarr.clone();
        print("copyclone",copyclone);

        /*System의 arraycopy를 이용한 복사*/
        int[] copyarrarcopy=new int[10];
        /*System.arraycopy(원본배열,복사를 시작할 인덱스,복사본 배열,복사를 시작할 인덱스,복사할길이)*/
        System.arraycopy(originarr,0,copyarrarcopy,0,originarr.length);
        print("copyarraycopy",copyarrarcopy);
        /*Arrays의 copyof()를 이용한 복사*/
        /*원본배열의 시작 인덱스부터 원하는 길이만큼 복사해서 사용가능하다*/
        int[] copycopyof= Arrays.copyOf(originarr,4);
        print("copycopyof",copycopyof);

        /*향상된 for문
        * for(자료형 변수명B:반복가능한 객체A){
        *
        * }
        * A에 들어가있는 값을 변수명 B로 순서대로 받아온다
        * */
        print("copycloneex",copyclone);
        print("copyclonex ex originarr",originarr);

        int[]twmparr={3,2,1,3};
        for (int value:twmparr){
            copyclone[value]=5;
        }
        /*
        * copyclone[3]=5;
        * copyclone[1]=5;
        * copyclone[2]=5;
        * copyclone[3]=5;*/
    }
    public static void print(String name,int[] arr){
        System.out.println(name+"의 헤쉬코드():"+arr.hashCode());

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
