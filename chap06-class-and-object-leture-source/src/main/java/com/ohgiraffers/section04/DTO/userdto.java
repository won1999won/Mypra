package com.ohgiraffers.section04.DTO;

public class userdto {
    /*자바 빈이란
    * jsp에서 배우게될 표준 액션 태그로 접근할수있는 자바클래스
    * 자바코드를 모르는 퍼블리셔들도 자바코드를 사용할수있도록 태그형식으로 지원하는 문법을 의미하는데
    * 그때 사용할수있도록 규칙을 지정해놓은 자바클래스를 자바빈이라 부른다
    * 결국 특정목적에 따라 클래스를 작성하는 규칙리라 보면된다
    *
    *
    *
    *
    * 자바빈 작성규칙
    * 1.자바빈은 특정 패키지에 속해있어야 함(default 패키지 사용 불가)
    * 2.멤버 변수의 접근제어자는 프라이빗으로 선언해야함
    * 3.기본 생성자가 명시적으로 존재해야함(매개변수 있는 생성자는 선택사항)
    * 4.모든 멤버 변수에 접근 가능한 설정자와 접근자가 퍼블릭으로 작성되어야함
    * */

    private String id;
    private String name;
    private String psw;
    private java.util.Date enrolldata;

    public userdto(){}

    public userdto(String id,String psw,String name,java.util.Date enrolldata){
        this.id=id;
        this.psw=psw;
        this.name=name;
        this.enrolldata=enrolldata;
    }

    /*설정자*/
    public void setId(String id){
        this.id=id;
    }
    public void setPsw(String psw){
        this.psw=psw;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEnrolldata(java.util.Date enrolldata){
        this.enrolldata=enrolldata;
    }

    /*접근자*/
    public String getId(){
        return id;
    }public String getName(){
        return name;
    }
    public String getPsw(){
        return psw;
    }
    public java.util.Date getEnrolldata(){
        return enrolldata;
    }
    public String getinfo(){
        return "userdto [id="+this.id+",psw="+this.psw+",enrolldate="+this.enrolldata+"]";
    }
}



