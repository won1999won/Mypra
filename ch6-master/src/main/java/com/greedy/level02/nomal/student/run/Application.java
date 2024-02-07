package com.greedy.level02.nomal.student.run;

import com.greedy.level02.nomal.student.model.vo.StudentVO;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StudentVO so=new StudentVO();
        so.printInformation(sc);
    }
}
