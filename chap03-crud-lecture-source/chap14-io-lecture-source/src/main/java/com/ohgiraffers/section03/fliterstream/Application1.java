package com.ohgiraffers.section03.fliterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         * bufferwritter/bufferdreader
         * 필터스트림은 외부데이터에 직접 연결하는것이 아니라 기본스트림에 추가로 사용 할수있는 스르팀
         * 주로 성능을 향상시키는 목적으로 사용되며 생성자를보면 구분이 가능하다
         * 생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼수있다*/

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/fliterstream/testBufferd.txt"));
            bw.write("반\n");
            bw.write("안\n");

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("scr/main/java/com/ohgiraffers/section03/fliterstream/testBufferd.txt"));
            String temp;
            while (true) {
                try {
                    if (!((temp = br.readLine()) != null)) break;
                    System.out.println(temp);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (br!=null){
                        try {
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
