package com.ohgiraffers.section01.list.dto;

public class bookDTO {

    private int number;
    private String title;
    private String author;
    private int price;

    public bookDTO() {
    }

    public bookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }


        public int getNumber () {
            return number;
        }

        public void setNumber ( int number){
            this.number = number;
        }

        public String getTitel () {
            return title;
        }

        public void setTitel (String titel){
            this.title = titel;
        }

        public String getAuther () {
            return author;
        }

        public void setAuther (String auther){
            this.author = auther;
        }

        public int getPrice () {
            return price;
        }

        public void setPrice ( int price){
            this.price = price;
        }


        @Override
        public String toString () {
            return "bookDTO{" +
                    "number=" + number +
                    ", titel='" + title + '\'' +
                    ", auther='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

