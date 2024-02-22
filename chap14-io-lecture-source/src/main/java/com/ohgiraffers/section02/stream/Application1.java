package com.ohgiraffers.section02.stream;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        FileInputStream fin=null;
        try {
            fin=new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;
//            while ((value=fin.read()) != -1){
//                System.out.println(value);
//                System.out.println((char) value);
//            }
            System.out.println("파일의 길이"+"src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt".length());

            int filesize=(int )new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bar=new byte[filesize];
            fin.read(bar);
            for (int i=0;i< bar.length;i++){
                System.out.print((char) bar[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();;
        } finally {
            if(fin!=null){
                try {
                    fin.close();
                    /*자원반납을 하느이유
                    * 1.장기간 실행중인 프로그램에서 스트림을 닫지않은 경우 리소스에서 누수발생
                    * 2.버퍼를 이용하는 경우 마지막에 flush()로 버퍼에있는 데이터를 강제전송해야한다
                    * 잔류데이더가 남은상태에서 추가로 스트림을 사용하면 데드락 상태가 된다
                    * 이 상황을 판단하기 힘들거나 의도치않은 사고를 방지하기위해 마지막에는 flush()를 한다
                    * close()메소드는 자원을 반납하면서 flush()까지 하므로 close()만 써도된다
                    *
                    *고로 외부자원을 사용할경우 반드시 close()를 마지막에 호출해야한다*/
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    /*stream
    * 외부데이터를 대상으로 작업할때 가장 먼저 해야할일은 자바프로그램과
    * 외부프로그램을 연결하는것이다
    * 프로그램과 외부데이터가 연결된길을 스트림이라한다
    * 스트림은 단방향이기에 데이터를 읽는 길은 입력스트림
    * 출력하는 길은 출력스트림이라한다
    *
    * java.io
    *
    * inputstream과 reader는 데이터를 읽어오는 레퍼런스
    * outputstream과 writer는 데이터를 내보내는 스트림
    * inputstream과outputstream은 1byte 단위로 입출력한다
    * reader와 writer는 문자(2,3byte)단위로 작업한다
    *
    * 자바 프로그램과 연결되는 외부 데잍의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능
    * InputStream/OuputStream/Reader/Writer 를 빼고 남는 단어가 외부데이터의 타입이다*/



}
