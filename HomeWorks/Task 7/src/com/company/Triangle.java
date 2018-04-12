package com.company;

public class Triangle extends Figure {
    int a = 8;
    int h = 3;
    @Override
    public void draw(){
        System.out.print("Треугольник = ");
    }
    public void area(){
        double area = (a * h) * 1/2;
        System.out.print(area);
    }
}
