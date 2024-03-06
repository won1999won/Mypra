package com.ohgiraffers.section03.fliterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 데이더 입출 보조 스트림
        * Datainputstream/dataoutputstream
        * 외부 데이더로부터 읽어오는 데이터를 바이트형 정수 문자 문자열로만 읽어오면
        * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야한다
        * 따라서 데이터자료형별로 저리하는 기능인 보조스트림 제공하고있다
        * */

        DataOutputStream dout=null;
        try {
            dout= new  DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/fliterstream/score.txt"));
            /*파일에 자료형으로 기록*/
            dout.writeUTF("홍홍홍");
            dout.writeInt(99);
            dout.writeUTF("뭐");
            dout.writeChar('a');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (dout!=null){
                try {
                    dout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            DataInputStream din=null;
            try {
                din=new  DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/fliterstream/score.txt"));
                while (true){
                    System.out.println(din.readUTF()+","+din.readInt()+","+din.readUTF()+","+din.readChar());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (EOFException e){
                System.out.println("읽기종료");
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if (din!=null){
                    try {
                        din.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
