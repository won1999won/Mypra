package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /*filereader
        *
        * fileinputstream과 사용방법은 거의 동일하다
        * 단,byte단위가 아닌 character단위로 딝어 들이는 부분이 차이점
        * 따라서 2바이트던 3바이트던 들자단위로 읽기에 한글을 정상적으로 읽을수있다
        * */

        FileReader fr=null;
        try {
            fr=new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

//            int value;
//            while ((value= fr.read())!=-1){
//                System.out.println((char) value);
//            }
//            char[] carr=new char[(int)new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt")];

//            fr.read(carr);
//            for (int i=0;i< carr.length;i++){
//                System.out.println(carr[i]);
//            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fr !=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
