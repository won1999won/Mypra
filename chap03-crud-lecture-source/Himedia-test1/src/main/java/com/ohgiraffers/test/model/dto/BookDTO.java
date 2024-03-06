package com.ohgiraffers.test.model.dto;

import java.util.ArrayList;

public class BookDTO {
    private int bNo;
    private int catagory;
    private String titel;
    private String author;
    public BookDTO(){}

    public BookDTO(int bNo, int catagory, String titel, String author) {
        this.bNo = bNo;
        this.catagory = catagory;
        this.titel = titel;
        this.author = author;
    }

    public String catagorySH(int catagory) {
        switch (catagory) {
            case 1:
                System.out.println("인문");
            case 2:
                System.out.println("자연과학");
            case 3:
                System.out.println("의료");
            case 4:
                System.out.println("기타");

        }
        return catagorySH(catagory);
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCatagory() {

        return catagory;
    }

    public void setCatagory(int catagory) {
        this.catagory = catagory;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                ", Catagory="+catagorySH(catagory)+'}';
        }
                ;
    }

