package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /*FileWriter
        * 프로그램의 데이더를 파일로 내보내기위한 용도의 스트림
        * 1글자 단위의 데이터를 처리
        * */

        FileWriter fw=null;

        try {
            fw=new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97);
            /*문자기반스트림은 직접 char 자료형으로 내보내는것이 가능하다*/
            fw.write('A');

            fw.write(new char[]{'a','s','f','\n'});
            fw.write("에베베");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
        e.printStackTrace();
    }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
}
