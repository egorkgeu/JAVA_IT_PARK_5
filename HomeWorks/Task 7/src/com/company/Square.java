package com.company;

public class Square extends Figure {
    int a = 4;

    @Override
    public void draw(){
        System.out.print("Квадрат = ");
    }
    public void area() {
        int area = (int) (Math.pow(a, 2));
        System.out.println(area);
    }
}
