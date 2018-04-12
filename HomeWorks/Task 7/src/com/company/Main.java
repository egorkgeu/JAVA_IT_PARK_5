package com.company;


public class Main {

    public static void main(String[] args) {
        Figure[] arr = new Figure[] {new Circle(), new Square(), new Rectangle(), new Oval(), new Triangle()};
        for (int i = 0; i < arr.length; i++){
            arr[i].draw();
            arr[i].area();


        }
    }
}
