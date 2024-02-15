package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class the_dog {
    person ps;
    Scanner sc=new Scanner(System.in);
    public String dogname;
    public String ex;

    Application app;

    public the_dog() {

    }

    public String getName() {
        return dogname;
    }

    public void setName() {
        this.dogname=dogname;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public the_dog(String dogname) {
        this.dogname = dogname;
    }

    public the_dog(String dogname, String[] ex) {
        this.dogname = dogname;
        this.ex=getEx();

    }

    public void learnAblilty(String Ablilty){
        String lnabli=ex;




    }


}
