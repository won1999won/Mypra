package com.ohgiraffers.section03.dto;

public class Application1 {
    public static void main(String[] args) {
        /*
        * [dto]
        * 캡슐화의 원칙에는 일부 어긋나지만 다른 목적을 ㄱ진 클래스와 객체를 추상화 하는 기법
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(data transfer object)
        * z캡슐화의 원칙을 준수하여 모든 필드를 프라이빗으로 설정해 접근을 막고
        * 각 필드값을 변경하거나 반환하는 메소드 세트를 미리 작성한다
        * 프라이빗 필드와 필드 값을 수정하는 설정자(setter)필드에 접근하는 접근자(getter)로 구성된다
        * 주로 계층간 데이터를 주고 받는 목적으로 사용된다*/

        /*setter메소드를 이용한 필드에 값대입*/
        MemberDTO member=new MemberDTO();
        member.setNumber(1);
        member.setName("aaa");
        member.setAge(99);
        member.setGender('m');
        member.setHegiht(175.5);
        member.setWeight(66.4);
        member.setActivated(true);

        System.out.println("번호"+member.getNumber());
        System.out.println("이름"+member.getName());
        System.out.println("나이"+member.getAge());
        System.out.println("키"+member.getHegiht());
        System.out.println("몸무게"+member.getWeight());
        System.out.println("성별"+member.getGender());
        System.out.println("회원"+member.isActivated());


    }
}
