package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*컬렉션 프레임 워크
        * 여러개의 다양한 데이터를 쉽고 효과적으로 처리할수있도록
        * 표준화된 방법을 제공하는 클래스의 집합
        * 즉 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현하는것
        *
        *
        *
        *collecttion framework는 크게 3가지 인터페이스중 한개를 상속받아구현
        * 1.list
        * 2.set
        * 3.map
        *
        * 리스트 인터페이스와 셋 인터페이스의 공통부분을 컬렉션 인터펭스에서 정의하고있다
        * 하지만 맵은 구조상차이로 컬렉션 인터페이스에서 장의하지 않는다
        *
        * 리스트
        * 순서있는 데이터의 집합으로 데이터의 중벅저장을 허용
        * vector arraylist linkedlist stack queue등
        *
        * 셋
        * 순서가 없는 데이터의 집합으로 데이터의 붕복저장을 허용않음
        * hashset treeset
        *
        * 맵
        * 키와 한쌍을 이루는 데이터 집합
        * 키를 셋방식으로 관리하기에 데이터의 순서를 관리하지않고 중복 키 를 허용않음
        * value는 중복 값을 저장할수있다
        * hashmap treemap hashtable properties 등
        * */

        /*arraylist
        *
        * 배열의 단점을 보완하기 위해 만들어졌다
        * 배열은 크기를 변경할수없고 요소의 추가 삭제 정렬이 복잡하다
        * arraylist는 저러한 단접을 보완하고 크기변경(더큰 새배열만들고옮기기)
        * 요소의 추가 삭제 정렬을 메소드로 구현
        * 처리속도가빨라지지는 않는다*/

        /*어레이리스트는 생성시 내부적으로 10칸의 배열을 생성 관리한다*/
        ArrayList alist =new ArrayList();

        List list=new ArrayList();

        Collection clist=new ArrayList();

        alist.add("apple");
        alist.add(123);
        alist.add(123.123);
        alist.add(new Date());

        System.out.println("alist"+alist);

        System.out.println("alist size"+alist.size());

        for (int i=0;i<alist.size();i++){
            System.out.println(i+":"+alist.get(i));
        }
        alist.add("apple");
        System.out.println("alist:"+alist);

        alist.add(1,"banana");
        System.out.println("alist:"+alist);
        alist.remove(1);
        System.out.println("alist:"+alist);

        alist.set(1,Boolean.valueOf(true)); //밸류오브:boolean<->Boolean api 래퍼클래스 참고
//        alist.set(1,true);
        System.out.println("alist"+alist);

        /*제네릭 타입을 지정시 지정타입외 인스턴스는 저장불가*/
        List<String> stringList=new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("kiwi");
        stringList.add("rich");
        System.out.println("stranglist:"+stringList);

        Collections.sort(stringList);
        System.out.println("stringlelist"+stringList);

        stringList=new LinkedList<>(stringList);

        /*iterator
        * collection 인터페이스의 iterator()메소드를 이용해서 인스턴스를 생성할수있다
        * 반복자라고 불리며 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용되기 위함이다
        * 인덱스를 사용하지않고도 반복문을 사용하기위한 목록을 반들어주는 역할
        * hasnext():다음 요소를 가지고 있는경우 true아닐경우 false를 반환
        * next():다음요소를 반환
        *
        * */

        Iterator<String>diter=((LinkedList<String>) stringList).descendingIterator();

        List<String> desclist=new ArrayList<>();

        while (diter.hasNext()){
            desclist.add(diter.next());
        }
        System.out.println("desclist:"+desclist);





    }
}
