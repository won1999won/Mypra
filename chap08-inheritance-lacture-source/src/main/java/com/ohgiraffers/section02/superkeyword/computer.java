package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class computer extends product{

    private String cpu;
    private int hdd;
    private int ram;
    private String OS;

    public computer(){
        System.out.println("컴퓨터 기본생성자 호출");
    }

    public computer(String code, String brand, String name, int price, Date manufaturingdata, String cpu, int hdd, int ram, String OS) {
        super(code, brand, name, price, manufaturingdata);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.OS = OS;
        System.out.println("컴퓨터 클래스의 모든 클래스와 부모 필드를 초기화하는 생성자 호출");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
    @Override
    public String getinfo(){
        return super.getinfo()
                +"compter"
                +"cpu"+this.cpu
                +"hdd"+this.hdd
                +"ram"+this.ram
                +"os"+this.OS;
    }
}
