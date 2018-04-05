package com.company;
public class RationalNumber {
    int a;
    int b;

    public RationalNumber() {
        a = 0;
        b = 1;
    }

    public RationalNumber(int x, int y) {
        a = x;
        b = y;
    }

    public void show() {
        System.out.println(a + "/" + b);
    }

    public double toDouble() {
        return (double)a/b;
    }

    public int nod() {
        while(a!= 0 && b!= 0) {
            if (a > b)
                if (a % b == 0)
                    return b;
                else
                    a = a % b;
            else
            if (b % a == 0)
                return a;
            else
                b = b % a;
        }
        if (a == 0 && b == 0)
            return 0;
        else
            return a+b;
    }

    public void optimize() {
        if (nod() != 0) {
            a = a / nod();
            b = b / nod();
        }
    }
}