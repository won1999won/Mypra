package com.ohgiraffers.common;

public class PersonalAccount implements Account {

    private final int BackCode;
    private final String accNo;
    private int blace;

    public PersonalAccount(int backCode,String accNo){
        this.BackCode=backCode;
        this.accNo=accNo;
    }
    @Override
    public String getBlace() {
        return this.accNo+"계좌잔액:"+this.blace;
    }

    @Override
    public String deposit(int money) {
        String string="";
        if (money>0){
            this.blace+=money;
            string=money+"원 입금";
        }else {
            string="error";
        }return string;
    }

    @Override
    public String withDrow(int money) {
        String s="";
        if (money>this.blace){
            s="잔액부족";
        }else {
            this.blace-=money;
            s=money+"출금";
        }return s;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "BackCode=" + BackCode +
                ", accNo='" + accNo + '\'' +
                ", blace=" + blace +
                '}';
    }
}
