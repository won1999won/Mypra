package com.ohgiraffers.section03.dto;

public class MemberDTO {

    private int number; //회원번호
    private  String name;  //이름
    private  int age; //나이
    private  char gender; //성별
    private double hegiht; //키
    private double weight; //몸무게
    private boolean isActivated; //탈퇴여부

    /*settet작성규칙
    *
    * 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    * 호출당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다
    * setter 표현식
    *
    * public void set 필드면(매개변수){
    *          필드=매개변수;
    * }
    *
    * 작성예시
    *public void set name(String name){
    *             this.name=name;
    * }
    *
    * getter 작성규칙
    * 필드의 값을 반환받을 목적의 메소드 집합으로 각 접근자는 하나의 필드에만 접근하도록한다
    * 필드에 접근해서 기록된 값을  return을 이용해 반환하며 이때 반환타입은 반환하려는 값의 자료형과 일치시킨다
    *
    * getter표현식
    * public 반환형 get필드면(){
    *         return 반환값;
    * }
    * 작성예시
    * public String getname(){
    *        return this.name
    * }
    * */


    /*설정자 메소드*/

    public void setNumber(int number){
        this.number=number;


    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setHegiht(double hegiht){
        this.hegiht=hegiht;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public  void setActivated(boolean isActivated){
        this.isActivated=isActivated;
    }
    /*접근자 메소드*/
    public int getNumber(){return number;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public  char getGender(){return gender;}
    public double getHegiht(){return hegiht;}
    public double getWeight(){return weight;}

    /*boolean의 접근자는 get이 아닌 is로 시작하는게 일반적이다*/
    public boolean isActivated(){return isActivated;}


}
