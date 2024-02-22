package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /*fileoutputstream
        *
        * 프로그램의 데이터를 파일로 내보내기위한 용도의 스트림
        * 1바이트 단위로 처리한다
        * */

        FileOutputStream fout=null;
        try {
            fout=new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fout.write(97);
            /*10=개행문자   */
            byte[] bar=new byte[]{98,99,100,101,102,10};
            fout.write(bar);
            fout.write(bar,1,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fout!=null){
                try {
                    fout.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
