package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /*set 인터페이스를 구현한 set컬렉션 클래스의 특징
        * 1.요소의 저장순서를 유지하지않는다
        * 2.같은 요소의 중복저장을 허용하지않는다
        *
        *
        * hashset 클래스
        * 셋 콜렉션 클래스에서 가장 많이 사용되는 클래스중하나
        * jdk1.2부터 제공되며 해시 알고리즘을 사용하여 검색속도가 빠르다
        * */

        HashSet<String> hset=new HashSet<>();

//        Set hset2=new HashSet();
//        Collection hset3= new HashSet();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        System.out.println("hest:"+hset );

        hset.add("java");
        System.out.println("hset:"+hset);
        System.out.println("저장객체수:"+hset.size());
        System.out.println("포함확인:"+hset.contains("oracle"));

        /*toArray():헤쉬셋에 저장된 모든요소를 포함하는 새로운 오브젝트 타입의 배열반환*/
        Object[] arr= hset.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(i+":"+arr[i]);
        }
        /*interator():콜렉션 인터페이스의 메소드로 콜렉션에 저장된 요소들을 손차적으로 접근하는데 사용하는 interator를 반환*/
        Iterator<String> iter= hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.hasNext());
        }
        hset.clear();
        System.out.println("empty?:"+hset.isEmpty());
    }
}
