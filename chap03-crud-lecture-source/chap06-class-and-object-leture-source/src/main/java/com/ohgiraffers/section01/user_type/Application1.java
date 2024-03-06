package com.ohgiraffers.section01.user_type;

public class Application1 {
    public static void main(String[] args) {

        /*변수를 이용한 회원관리*/

        String id="userid";
        String pwd="userpwd";
        String name="kim";
        int age=20;
        char gender= 'm';
        String[] hobby= new String[]{"당구","볼링","배드민턴"};

        System.out.println("id:"+id);
        System.out.println("pwd:"+pwd);
        System.out.println("name:"+'m');
        System.out.println("age:"+20);
        System.out.println("gender:"+'m');
        System.out.println("hobby:");
        for (int i=0;i< hobby.length;i++){
            System.out.println(hobby[i]+" ");
        }
        Member member=new Member();
        /*
        * 필드에 접근하기 위해선 레퍼런스변수명.필드명으로 접근
        * '.'은 참조 연산자라고 하는데,레버런스 변수가 참조하고있는 주소로 접근한다는 의미다
        * 각 공간은 필드명으로 접근한다(배열은 인덱스 접근,객체는 필드로 접근*/
        System.out.println("member.id:"+ member.id);
        System.out.println("member.pwd:"+ member.pwd);
        System.out.println("member.name:"+ member.name);
        System.out.println("member.age:"+ member.age);
        System.out.println("member.gender:"+ member.gender);
        System.out.println("member.hooby:"+ member.hobby);

        member.id="user01";
        member.pwd="pass01";
        member.name="kim";
        member.age=20;
        member.gender='m';
        member.hobby=new String[]{"a","c","b","d","c"};

        System.out.println("변경후 member.id:"+member.id);
        System.out.println("변경후 member.pwd:"+member.pwd);
        System.out.println("변경후 member.name:"+member.name);
        System.out.println("변경후 member.age:"+member.age);
        System.out.println("변경후 member.gender:"+member.gender);
        System.out.println("변경후 member.hobby:");
        for (int i=0;i< hobby.length;i++){
            System.out.println(member.hobby[i]+" ");
        }




    }


}
