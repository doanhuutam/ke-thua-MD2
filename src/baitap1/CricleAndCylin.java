package baitap1;

import com.company.HeHInhHoc;

public class CricleAndCylin {
    private double radius=1;
    private String color="đen xì";

    public CricleAndCylin() {
    }

    public CricleAndCylin(double radius ,String color) {
        this.radius = radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CricleAndCylin{" +
                "radius=" + radius +
                ", color='" + color + '\'' +"ARea"+getArea()+
                '}';
    }
    public static class CircleTest {
        public static void main(String[] args) {
            CricleAndCylin cr =new CricleAndCylin();
            System.out.println(cr);
            cr =new CricleAndCylin(2,"red");
            System.out.println(cr);
            cr= new CricleAndCylin(10,"đen xì");
            System.out.println(cr);
            Cylin cr1=new Cylin();
            cr1=new Cylin(9);
            System.out.println(cr1);
        }
    }

}








