package com.ohgiraffers.section03.fliterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*형변환 보조스트림
         * 기본 스트림이 byte기반 스트림이고 보조스트림이 char기반 스트림인경우 사용
         *
         * 표준 스트림(바이트 기반 스트림)
         * 시스템 클래스 필드 in out err가 대상데이터에 스트림을 의미한다
         * system.in(inputstream)콘솔로부터 데이터를 입력받는다
         * system.out(printstream)콘솔로 데이터를 출력한다(에러)
         * system.err(printstream)콘솔로 데이터를 출력한다(에러)
         * 자주 사용되는 자원에대해 미리스트림이 생성되어있기에 별도의 스트림을 생성하지 않아도된다*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문자열");
        try {
            String value = br.readLine();
            System.out.println("value:"+value);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("java mysql jdbc");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
