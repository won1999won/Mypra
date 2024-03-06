package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {


        /*linkedlist
        *
        * Arraylist가 배열을 이용해서 발생할수있는 성능적인 단점을 보완하고자 고안
        * 내부는 이중연결리스트로 구현
        *
        * 단인 열결 리스트
        * 저장한 요소가 순서를 유지하지않고 저장되지만 이러한 요소들 사이를 링크로 연결하여
        * 구성하며 마치 연결된 리스트의 형태인것처럼 만든 자료구조
        * 요소의 저장과 삭제시 다음 요소를 가리키는 참조링크만 변경하면 되기에
        * 요조의 저장과 삭제가 빈번한 경우 arraylist보다 우수하다
        * 하지만 단일연결리스트는 다음요소만 링크하기에 이전요소로는 접근이 힘들다
        * 이를 보완한것이 이중연결리스트다
        *
        * 이중열결리스트
        * 단일열결리스트는 다음요소만 링크하는 반면 이중연결리스트는 이전요소도 링크하여ㅛ
        * 이전요소로 접근하기 쉽게 고완된 자료구조다
        * */

        List<String>linkedlist=new LinkedList<>();

        linkedlist.add("애플");
        linkedlist.add("banana");
        linkedlist.add("onrange");
        linkedlist.add("mango");
        linkedlist.add("grape");

        System.out.println(linkedlist.size());

        for (int i=0;i<linkedlist.size();i++){
            System.out.println(i+":"+linkedlist.get(i));
        }
        linkedlist.remove(1);
        for (String s:linkedlist){
            System.out.println(s);
        }
        linkedlist.set(0,"me");
        System.out.println(linkedlist);
        System.out.println(linkedlist.isEmpty());

        linkedlist.clear();

        System.out.println(linkedlist.isEmpty());
    }
}
