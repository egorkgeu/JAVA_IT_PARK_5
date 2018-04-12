package com.company;

public class Circle extends Figure {
   public float Pi = 3.14f;
   public int r = 5;

    @Override
    public void draw(){
        System.out.print("Круг = ");
    }
    public void area() {
        float area = Pi * (int)(Math.pow(r,2));
        System.out.println(area);
    }
}
