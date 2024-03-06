package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /*queue
        *
        * queue는 선형 메모리 공간에 데이터를 저장하는
        * 선입선출(FIFO)방식의 자료구조
        * queue인터 페이스를 상속받는 하위 인터 페이스들은
        * deque blockingqueue blokingdeque transferqueue등 다양하지만
        * 대부분의 큐는 링크드리스드를 이용한다*/



        /*queue 자체로는 인터페이스 이기때문에 인스턴스 생성이 불가능하다*/
//        Queue<String>que=new Queue<>();

        Queue<String> que=new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        /*
        * peek():해당큐의 가장앞의 있는 (먼저 들어온 요소)를 반환
        * poll():해당 큐의 가장 앞에 있는 요소를 반환하고 삭제
        * */
        System.out.println("peek():"+que.peek());
        System.out.println("peek():"+que.peek());

        System.out.println(que);
        System.out.println("poll():"+que.poll());
        System.out.println("poll():"+que.poll());

        System.out.println(que);

    }
}
