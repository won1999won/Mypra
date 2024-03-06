package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {

        /*문자의 객체를 만드는 방법
         * ""리터럴 형태:동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(singgleton)
         * new string("문자열"):매변 새로운 인스턴스를 생성
         * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1==str2:"+(str1==str2));
        System.out.println("str2==str3:"+(str2==str3));
        System.out.println("str3==str4:"+(str3==str4));

        /*같은 문자열은 같은 헤쉬를 가진다*/

        System.out.println("str1의 헤쉬:"+str1.hashCode());
        System.out.println("str2의 헤쉬:"+str2.hashCode());
        System.out.println("str3의 헤쉬:"+str3.hashCode());
        System.out.println("str4의 헤쉬:"+str4.hashCode());
        /*문자열은 불변의 특징을 가진다
        * 기존 문자열에+연산을 수행하는 경우 문자열을 수정하는것이 아니고 새로운 문자열을 할당한다*/

        str2+="oracle";
        System.out.println("str1==str2:"+(str1==str2));

        /*equals():스트링 클래스의 이퀄메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
        * 동일한경우 참 아닐경우 거짓을 반환하도록
        * 오브젝트의 이퀄메소드를 재정의 해두었다
        * 따라서 문자열 인스턴스 생성방식과 상관없이 동일한 문자열인지 비교하기위해 ==연산대신
        * 이퀄메소드를 쓴다*/

        System.out.println("str1.equals(str3):"+str1.equals(str3));
        System.out.println("str1.equals(str4):"+str1.equals(str4));

        /*new.java.util.Scanner(Sistem.in);을 이용해 문자열을 입력받는경우
        * substring으로 잘라내기해서 새로운 문자열을 생성후 반환하기때문에
        * new string()으로 인스턴스를 생성한것으로 볼수있다
        * 따라서 scanner로 입력받은 문자열을 비교할때는 이퀄을 써야한다
        * 구분하기 어려울시 그냥 이퀄을 쓰자*/
    }

}
