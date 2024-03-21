package com.ohgiraffers.menu.model.service.controller;

public class MenuPriceCalcullator {
    public int calcOrderPrice(String menuName,int amount){
        int oderprice=0;
        switch (menuName){
            case "1":oderprice=1000*amount;break;
            case "2":oderprice=2000*amount;break;
            case "3":oderprice=3000*amount;break;
            case "4":oderprice=4000*amount;break;
            case "5":oderprice=5000*amount;break;
            case "6":oderprice=6000*amount;break;


        }
        return oderprice;
    }
}
