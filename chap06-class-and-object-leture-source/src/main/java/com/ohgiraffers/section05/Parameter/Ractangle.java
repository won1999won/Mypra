package com.ohgiraffers.section05.Parameter;

public class Ractangle {

    private  double width;

    private  double higth;

    public void RectAngle(double width, double higth){
        this.higth=higth;
        this.width=width;

    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHigth(double higth){
        this.higth=higth;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHigth(){
        return this.higth;
    }
    public void calcarea(){
        double area=width*higth;
        System.out.println("넓이:"+area);;
    }
    public void calcraund(){
        double round=(width=higth)*2;
        System.out.println("둘레:"+round);
    }
}
