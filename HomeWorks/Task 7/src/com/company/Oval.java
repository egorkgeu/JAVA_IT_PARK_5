package com.company;

public class Oval extends Figure {
    private double BigRadius;
    private double SmallRadius;

    public Oval(double bigRadius, double smallRadius) {
        BigRadius = bigRadius;
        SmallRadius = smallRadius;
    }

    public double getBigRadius() {
        return BigRadius;
    }

    public double getSmallRadius() {
        return SmallRadius;
    }

    @Override
    public void draw(){
        System.out.print("Овал = ");
    }
    public void area() {
        double area = Math.PI * this.BigRadius * this.SmallRadius;
        System.out.println(area);
    }
}
