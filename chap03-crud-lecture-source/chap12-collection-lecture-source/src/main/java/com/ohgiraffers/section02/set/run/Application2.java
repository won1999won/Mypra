package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /*likedhashset 클래스
        * 해쉬셋이 가지는 기능을 모두가지며
        * 추가적으로 저장순서를 유지한다
        * jdk1.4부터
        * */

        LinkedHashSet<String>lhset=new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset:"+lhset);

        TreeSet<String> tset=new TreeSet<>(lhset);
        System.out.println("test:"+tset);
    }
}
