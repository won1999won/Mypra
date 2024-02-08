package com.ohgiraffers.section01.object.book;

import com.ohgiraffers.section01.object.run.Application1;

public class book  {
    private  int number;
    private String titel;
    private String author;
    private int price;

    public book(){}

    public book(int number, String titel, String author, int price) {
        this.number = number;
        this.titel = titel;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    /*tostring()오버라이딩*/


    public String tostring(){
        return "bookvo{number="+this.number+",title"+titel+",author"+author+",price="+price+"]";

    }
    /*equals() 오버라이딩*/

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }if (obj==null){
            return false;
        }
        book other=(book) obj;
        if (this.number !=other.number){
            return false;

            /*title필드가 null인경우 다른 인스턴스의  titel이 null이 아니면 거짓을 반환*/
        }if (this.titel==null){
            if (other.titel!=null){
                return false;
            }
        }else if (!this.titel.equals(other.titel)){
            /*titel필드가 null이 아닌경우
            * 두 인스턴스의 titel필드값이 간아야한다
            * 아닐경우 거짓을반환
            *
            *
            * String클래스가 equaks()메서드를 오버라이딩 해서
            * 문자열이 같은지 비교하도록 재정의 되었기때문에
            * this.title과other.title의 문자열이 같은내용을 가지고있는지 확인한다*/
            return false;
        }
        if (this.author==null){
            if (other.author!=null){
                return false;
            }
        }else if (!this.author.equals(other.author)){
            return false;
        }
        if (this.price!=other.price){
            return false;
        }
        /*모든 조건을 통과하면 두 인스턴스는 같은 값을 가지므로 참을 반환*/
        return true;

    }
    /*헤쉬코드()오버라이딩*/


//    @Override
    public int hashcode(){
        /*필드마다 곡배줄 소수값선언
        * 31은 소수기때문에 연산기 동일한 헤쉬코드가 나오지않을 화률을 증가시킨다
        * 31이 통상적인 관례이며 String클래스의 헤쉬에도 사용되는값*/
        int result=1;
        final int prime=31;
        /*31과 필드값을 연산하여 새로운 헤쉬코드를 연산한다
        * 여기서필드값이 같을경우 동일 헤쉬를 반환하면된다*/

        /*스트링 클래스의 헤쉬코드 메소드는 이미 재정의 되어있다
        * 같은 값을 가지는 문자열은 동일한 헤쉬코드값을 반환한다*/

        result=prime*result+this.number;


        result=prime*result+this.titel.hashCode();
        result=prime*result+this.author.hashCode();
        result =prime*result+this.price;

        return result;

    }

}
