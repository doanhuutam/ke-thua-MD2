package baitap1;

import baitap1.CricleAndCylin;

public class Cylin extends CricleAndCylin {
    private double height=1;

    public Cylin() {
    }

    public Cylin(double height) {
        this.height = height;
    }


    public double getV(){
        return height*getRadius()*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylin{" +
                "height=" + height +"the tich"+getV()+
                '}';
    }
}
