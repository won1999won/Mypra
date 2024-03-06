package com.ohgiraffers.section04.constructor;

public class user {
    private String id;
    private String pwd;
    private  String name;
    private java.util.Date enrolldate;

    /*생성자의 사용목적
    * 1.인스턴스 생성 시점에 수행할 명령이있는경우
    * 2.매개변수 있는 생성자의 경우 전달받은 값으로 필드를 초기화 하며 인스턴스를 생성할 목적으로 주로사용
    * 3.작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지않는다는 의미를 가진다
    * 따라서 인스턴스를 생성하는 방법을 제한하기위한 용도로도 사용할수있다(초기값 전달 강제화)
    *
    * 생성자 표현식
    *  접근제한자 클래스명(매개변수){
    *    인스턴스 생성시첨에 수행할 명령기술(주로 필드 초기화)
    *    this.필드명=매개변수; //설정자여러개의 기능을 한번에 호출가능
    *
    *
    * }
    * 생성자 작성시 주의사함
    *1.생성자 메소드는 반드시 클래스이름과 동일해야한다
    *2.생성자 메소드는 반환형을 작성하지않는다(작성할경우 메소드로 인식함)
    * 기본생성자는 자바 컴파일러가 자동으로 추가해주는 구문이지만 명시적으로 작숭할수없다
    * 매개변수가 있는 생성자가 하나라도 존재할경우 기본생성자를 추가하지않기때문에
    * 기본생성자가 필요한경우 반드시 명시해야한다
    * */

    public user(){
        System.out.println("유저 클래스의 기본생성자 호출:");
    }
    /*동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다*/
//public user(){}

    public user(String id,String pwd,String name){
        this.id=id;  //this는 인스턴스 생성시점에 발생한 주소가 저장된다
        this.pwd=pwd;
        this.name=name;

        System.out.println("유저 클래스의 id,pwd,name을 초기화 하는 생성자 호출함");

    }


    public user(String id,String name,String pwd,java.util.Date enrolldate){
//        this.id=id;
//        this.name=name;
//        this.pwd=pwd;
//        this.enrolldate=enrolldate;
        /*this()사용하기
        * this()는 동일 클래스내에 자겅한 다른 생성자 메소드를 호출하는 구문
        * 괄호안에 매개변수의 타입 갯수 순서에 맞는 생성자를 호출하고 복귀한다(메소드와 동일)
        * this()는 가장 첫 줄에 선언해야하며 그렇지않은 경우 에러
        * */
        this(id,pwd,name); //미리 작성한 세개의 필드를 초기화 시키는 생성자로 매개변수가 받은값을 전달
        this.enrolldate=enrolldate;
        System.out.println("유저 클래스의 모든 필드를 초기화 시키는 생성자 호출");
    }

    public String getinfo(){
        return "user[id="+this.id+",psw="+this.pwd+this.name+",enrolldate="+this.enrolldate+"]";
    }

}
