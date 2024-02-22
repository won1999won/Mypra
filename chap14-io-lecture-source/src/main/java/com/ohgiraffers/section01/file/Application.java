package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /*Flie 클래스
        *jdk 1.0부터 지원하는 api로 파일 처리를 수핼하는 대표적인 클래스다
        * 대상 파일에대한 정보로 인스턴스를 생성하고
        * 파일의 생성,삭제등의 처리를 하는기능
        * */

        File file=new File("src/main/java/com/ohgiraffers/section01/file/test.txt");
        try {
            boolean creatSuccess=file.createNewFile();
            System.out.println("success:"+creatSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일의 크기:"+file.length()+"byte");
        System.out.println("파일경로:"+file.getPath());
        System.out.println("현재파일의 상위경로:"+file.getParent());
        /*절대경로:최상위 루트 위치부터의 경로*/
        System.out.println("파일의 절대경로:"+file.getAbsolutePath());

        boolean deltsuccess=file.delete();
        System.out.println("d-success:"+deltsuccess);

    }
}
