package com.ohgiraffers.section06.statickeyword;

public class staticfieldtest {

    private int nonstatic;

    private static int staticcount;

    public staticfieldtest(){}

    public int getNonstatic(){
        return this.nonstatic;
    }

    public static int getStaticcount() {

        /*스태틱 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다
        * this로도 가능하지만 하지않는것이 좋다*/
        return staticfieldtest.staticcount;
    }
    public void increasenonstaticcount(){
        this.nonstatic++;
    }
    public void increasestaticcont(){
        staticfieldtest.staticcount++;
    }
}
