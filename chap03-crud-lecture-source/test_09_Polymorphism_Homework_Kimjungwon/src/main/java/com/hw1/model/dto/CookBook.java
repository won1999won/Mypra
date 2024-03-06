package com.hw1.model.dto;

public class CookBook extends Book{
    private boolean coupon;

    public CookBook(){}

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                "title"+getTitle()+
                "author"+getAuthor()+
                "publisher"+getTitle()+
                '}';
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }


}
