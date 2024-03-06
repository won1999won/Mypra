package com.ohgiraffers.section02.solution;

public class monster3 {
//    String name;
//    int hp;

    //    public void setinfo(String info){
//        this.name=info;
//
//
//    }
//    public void sethp(int hp){
//        if (hp>=0){
//            this.hp=hp;
//        }else {
//            this.hp=0;
//        }
//    }
//    public String getinfo(){
//        return "이름"+this.name+"체력:"+this.hp;
//    }
    String kinds;
    int hp;

    public void setinfo(String info) {
        this.kinds = info;


    }

    public void sethp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getinfo() {
        return "이름" + this.kinds + "체력:" + this.hp;
    }
}
