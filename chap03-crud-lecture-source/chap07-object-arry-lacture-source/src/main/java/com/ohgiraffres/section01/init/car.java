package com.ohgiraffres.section01.init;

public class car {

    private String modelname;
    private int maxspeed;

    public car(String modelname,int maxspeed){
        this.maxspeed=maxspeed;
        this.modelname=modelname;
    }
    public void drrivemaxspeed(){
        System.out.println(modelname+"가 최고시속"+maxspeed+"km/h질주중");
    }
}
