package com.company;

public class Rectangle extends Figure {
    int a = 8;
    int b = 5;
    @Override
    public void draw(){
        System.out.print("Прямоугольник = ");
    }
    public void area(){
        int area = a * b;
        System.out.println(area);
    }
}
