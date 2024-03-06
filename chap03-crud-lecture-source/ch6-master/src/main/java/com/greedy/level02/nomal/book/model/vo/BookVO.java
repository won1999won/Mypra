package com.greedy.level02.nomal.book.model.vo;

public class BookVO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookVO() {
    }

    public BookVO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookVO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void setTitle(String title) {
            this.title = title;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }
        public String getTitle() {
            return title;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getAuthor() {
            return author;
        }

        public int getPrice() {
            return price;
        }

        public double getDiscountRate() {
            return discountRate;
        }
        public void printInformation() {
            System.out.println("Title: " + title);
            System.out.println("Publisher: " + publisher);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Discount Rate: " + discountRate);
        }

}


