package com.company;

public class Rectangle extends Figure {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw(){
        System.out.print("Прямоугольник = ");
    }
    public void area(){
        double area = this.lenght * this.width;
        System.out.println(area);
    }
}
