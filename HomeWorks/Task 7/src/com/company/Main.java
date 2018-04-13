package com.company;


public class Main {

    public static void main(String[] args) {
        Figure[] arr = new Figure[]{new Circle(5),
                new Square(7), new Rectangle(6, 3),
                new Oval(9, 4), new Triangle(6, 3)};
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
            arr[i].area();
        }
    }
}
