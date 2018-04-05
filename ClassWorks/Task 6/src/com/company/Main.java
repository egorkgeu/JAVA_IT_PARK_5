package com.company;
public class Main {

    public static void main(String[] args) {

        RationalNumber num = new RationalNumber(3, 9);
        num.show();
        System.out.println(num.toDouble());
        System.out.println();

        if (num.nod() == 0)
            System.out.println("нод = бесконечность");
        else
            System.out.println("нод = " + num.nod());
        System.out.println();

        System.out.println("optimized:");
        num.optimize();
        num.show();
        System.out.println(num.toDouble());
    }
}