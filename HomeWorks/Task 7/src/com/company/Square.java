package com.company;

public class Square extends Figure {
    private int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public void draw(){
        System.out.print("Квадрат = ");
    }
    public void area() {
        int area = (int) (Math.pow(this.lenght, 2));
        System.out.println(area);
    }
}
