package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * map 인터페이스의 특징
        * 콜렉션 인터페이스와는 다른 저장방식을 가진다
        * 키 와 값 을 하나의쌍으로 저장하는 방식
        *
        * 키(Key)란
        * 값을 찾기위한 이름의 역할을 하는 객체
        * 1.요소의 저장순서를 기억하지않는다
        * 2.키는 중복을 허용하지않지만 키가 다르면 중복되는 값은 저장 가능하다
        *
        * hashmap hashtable treemap 등이 대표클래스가있다
        * hashmap이 주로사용됨*/

        HashMap hmap=new HashMap();
        hmap.put("one",new Date());
        hmap.put(12,"apple");
        hmap.put(22,555);
        /*autoBoxing 처리됨:12->new Integer(12)*/
        System.out.println(hmap);

        /*키는 중복 저장되지않음(set):최근키로 오버라이드됨(덮어씀)*/
        hmap.put(12,"yellow banana");
        System.out.println(hmap);

        hmap.put(11,"yellow banana");
        hmap.put(9,"yellow banana");
        System.out.println("hmap:"+hmap);

        System.out.println("키 9의 객체:"+hmap.get(9));

        hmap.remove(9);
        System.out.println(hmap);

        System.out.println(hmap.size());

        new HashMap<>();

        HashMap<String,String>hmap2=new HashMap<>();

        hmap2.put("one","java 8");
        hmap2.put("two","mysql");
        hmap2.put("three","jdbc");
        hmap2.put("four","html5");
        hmap2.put("five","css3");

        Iterator<String>keyiter =hmap2.keySet().iterator();
        while ((keyiter.hasNext())){
           String key=keyiter.next();
          String value= hmap2.get(key);
            System.out.println(key+"="+value);
        }
        Collection<String> values=hmap2.values();
        Iterator<String> valueiter=values.iterator();

//        Iterator<String> valueiter=hmap2.values().iterator();

        while (valueiter.hasNext()){
            System.out.println(valueiter.next());
        }
        Object[] valueArr=values.toArray();
        for (int i=0;i<valueArr.length;i++) {
            System.out.println(i + ";" + valueArr[i]);
        }

        /*entry:키 겍체와 값 객체를 묶은것
        엔트리는 java.util.Map 인터페이스의 내부 인터페이스로,Map안의 키=값쌍을 나타넨다
        entryset():Map에 저장된 모든 키-값쌍(Entry)을 Set형태로 반환
        getkey() 와 getValue()메소드를 제공하여 키와 값을 각각 가져올수있다
        Map.Entry 객체는 하나의 키와 값에대한 참조를 제공하며 이를 통해 특정 Map항목의 키or값을 가져올수있다*/

        Iterator<Map.Entry<String,String>>entryiter=hmap2.entrySet().iterator();

//        Set<Map.Entry<String,String>>set=hmap2.entrySet();
//        Iterator<Map.Entry<String,String>>entryiter=set.iterator();

        while (entryiter.hasNext()){
            Map.Entry<String,String>entry=entryiter.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
