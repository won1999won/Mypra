package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /*스택
        *
        * 스택은 리스트 계열 클래스의 벡터 클래스를 상속받아 구현
        * 스택메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        * 후입선출(LIFO)방식의 자료구조라 부른다*/

        Stack<Integer>integerStack=new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        System.out.println(integerStack.search(5));

        /*stack에서 값을 꺼내는 메소드
        * peek():해당 스택 가장마지막(최상단)의 요소반환
        * pop():해당 스택의 마지막에있는(최상단)의 요소 반환후 제거*/

        System.out.println("peek:"+integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop:"+integerStack.pop());
        System.out.println("pop:"+integerStack.pop());
        System.out.println("pop:"+integerStack.pop());
        System.out.println("pop:"+integerStack.pop());
        System.out.println("pop:"+integerStack.pop());
        System.out.println("pop:"+integerStack.pop()); //emptystackexception 발생
        System.out.println(integerStack);
    }
}
