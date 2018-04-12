package com.company;

public class Oval extends Figure {
    float Pi = 3.14f;
    int R = 10;
    int r = 6;
    @Override
    public void draw(){
        System.out.print("Овал = ");
    }
    public void area() {
        float area = Pi * R * r;
        System.out.println(area);
    }
}
