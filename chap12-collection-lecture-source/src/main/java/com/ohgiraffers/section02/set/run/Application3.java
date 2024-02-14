package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*Treeset 클래스
        * 트리셋 클래스는 데이터가 정렬된 상태로 저장되는 이전 검색트리의 형태로 요소를 저장한다
        * 이진검색트리는 데이터를 추가하거나 제거하는등 기본동작시간이 매우바르다
        * jdk1.2부터 제공
        * 셋 인터페이스가 가지는 특징을 가지지만 정렬상태를 유지한다*/

        TreeSet<String>tset=new TreeSet<>();
        Set<String>tset2=new TreeSet<>();

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println("tset:"+tset);
        Iterator<String>iter= tset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().toUpperCase());
        }
        Object[]arr=tset.toArray();

        for (Object obj:arr){
            System.out.println(((String) obj).toUpperCase());
        }
        /*로또번호 발생(treeset 이용)*/
        Set<Integer> lotto=new TreeSet<>();

        while (lotto.size()<6){
            lotto.add(((int)(Math.random()*45))+1);
        }
        System.out.println("lotto:"+lotto);

    }
}
