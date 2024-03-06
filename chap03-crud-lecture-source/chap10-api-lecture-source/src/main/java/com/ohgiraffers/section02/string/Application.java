package com.ohgiraffers.section02.string;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {


        /*charAt():해당 문자열의 특정ㅇ닌덱스에 해당하는 문자를 반환한다
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우indexoutofboundsexeception이 발생한다
         * */

        String str1 = "apple";
        for (int i=0;i<str1.length();i++){
            System.out.println("charat("+i+"):"+str1.charAt(i));
        }
        /*compareto():인자로 전달된 문자열과 사전순으로 비교를 하여
        *두 문자열보다 작으면 음수를 크면 양수를 반환
        * 단 대소문자를 구분한다*/
        String str2="java";
        String str3="java";
        String str4="JAVA";
        String str5="oracle";

        System.out.println("compareto():"+(str2.compareTo(str3))); //0
        System.out.println("compareto():"+(str2.compareTo(str4))); //32
        System.out.println("compareto():"+(str4.compareTo(str2))); //-

        System.out.println("compareto():"+(str2.compareTo(str5))); //-5
        System.out.println("compareto():"+(str5.compareTo(str2))); //5

        /*comparetoignorecase():대소문자를 구별하징낳고 비교한다*/

        System.out.println("compareto():"+(str2.compareToIgnoreCase(str4))); //0

        /*contact():문자열에 ㅇ니자로 전달된 문자열을 합치기 해서 새로운 문자열을 반환한다
        * 원본 문자열에는 영향을주지않는다
        *
        * */
        System.out.println("concat():"+(str2.concat(str5))); //jacaoracle
        System.out.println("ste2:"+str2);



        /*indexof():문자열에서 특정문자를 탑색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다
        * 단 일치하지 않을경우 -1을 반환한다*/
        String indexof="java oracle";
        System.out.println("indexof('a'):"+indexof.indexOf('a')); //1
        System.out.println("indexof('b'):"+indexof.indexOf('b')); //-1

        /*trim():문자열의 앞뒤에 공백을 제거한 문자열을 반환*/

        String trimStr=" java";
        System.out.println("trimstr:#"+trimStr+"#");
        System.out.println("trim():#"+trimStr.trim()+"#");
        /*
        * tolowercase():모든 문자를 소문자로
        * touppercase():모든 문자를 대문자로*/
        String casestr="javaoracle";
        System.out.println("tolow:"+casestr.toLowerCase());
        System.out.println("toupper:"+casestr.toUpperCase());

        /*substring():문자열의 일부분을 잘라내여 새로운 문자열로 반환한다*/
        String javamysql="javamysql";
        System.out.println("sub(3,6):"+javamysql.substring(3,6));//amy
        System.out.println("sub(3):"+javamysql.substring(3));//amysql

        /*replace():문자열에서 대체할 문자열로 기존 문자열을 변경후반환*/
        System.out.println("rep():"+javamysql.replace("java","python"));

        /*length():문자열의 길이를 정수형으로 반환*/
        System.out.println("lag():"+javamysql.length());
//        System.out.println("빈 문자길이:"+(""+.length()));

        /*ismepty():문자열의 길이가 0이면 참 아니면 거짓을 반환*/
        System.out.println("isempty():"+"".isEmpty());
        System.out.println("isempty():"+"asd".isEmpty());

    }
    }
