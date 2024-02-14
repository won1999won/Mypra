package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /*properties
        * hashmap을 구현하여 사용용법이 거의 유사하지만 key와value모두 문자열로만 사용가능한 자료구조
        * 설정파일값을 읽어서 어플리케이션에 적용할때 사용*/

        Properties pron=new Properties();

        pron.setProperty("driver","com.mysql.jdbc.Driver");
        pron.setProperty("url","jdbc:mysql://localhost/menudb");
        pron.setProperty("user","ohgiraffers");
        pron.setProperty("password","ohgiraffers");

        System.out.println(pron);

        try {
            pron.store(new FileOutputStream("driver.dat"),"jdbc driver");
            pron.store(new FileWriter("driver.txt"),"jdbc driver");
            pron.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Properties prop2=new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load((new FileInputStream("driver.txt")));
            prop2.load(new FileInputStream("driver.xml"));

            prop2.list(System.out);

            System.out.println(pron.getProperty("driver"));
            System.out.println(pron.getProperty("url"));
            System.out.println(pron.getProperty("user"));
            System.out.println(pron.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
