package com.ohgiraffers.section03.fliterstream;

import com.ohgiraffers.section03.fliterstream.dto.Memberdto;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        /*objectinputstram/objectoutputstream
         * 객체단위로 입출력하도록 하는 보조 스트림
         * */

        Memberdto[] outputMember = {
                new Memberdto("user01", "pass01", "홍길동", "wwwwww@dddddd.com", 12, 'm', 123.4),
                new Memberdto("user02", "pass02", "길동", "rrrrrrrr@dddddd.com", 22, 'm', 12111.4),
                new Memberdto("user03", "pass03", "홍길", "yyyyy@dddddd.com", 162, 'f', 12663.4),

        };
        ObjectOutputStream object = null;
        try {
            object = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/fliterstream/testobjectstream2.txt", true)));
            System.out.println();
            for (int i = 0; i < outputMember.length; i++) {
                object.writeObject(outputMember[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (object != null) {
                try {
                    object.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

           /*NotserializableException
                직렬화 처리를 해주지않아서 발생하는 에러

                직렬화란
                자바시스템 내부에서 사용되는 객제 또는 데이터를 외부에서 사용할수있는 바이트로 변환하는 기술
                반대로 바이트로 변환된 데이터를 다시 객체로 변환하는것을 역직렬화라고함*/

        Memberdto[] memberdto = new Memberdto[3];
        ObjectInputStream object2 = null;

        try {
            object2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/fliterstream/testobjectstream2.txt")));

            while (true) {
                System.out.println(object2.readObject());


            }
        } catch (EOFException e) {
            System.out.println("end");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (object2 != null) {
                try {
                    object2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
