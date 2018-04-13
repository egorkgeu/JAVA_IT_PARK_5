package com.company;

public class Circle extends Figure {
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw(){
        System.out.print("Круг = ");
    }
    public void area() {
        double area = Math.PI * (int)(Math.pow(this.radius,2));
        System.out.println(area);
    }
}
