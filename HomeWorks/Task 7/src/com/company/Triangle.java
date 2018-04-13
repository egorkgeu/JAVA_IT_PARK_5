package com.company;

public class Triangle extends Figure {
    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw(){
        System.out.print("Треугольник = ");
    }
    public void area(){
        double area = (this.length * this.height) * 1/2;
        System.out.print(area);
    }
}
