package com.company;

public class Main {

    public static void main(String[] args) {

        int m[][] = new int[3][3];
        int s = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int) (Math.random() * 10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            s = s + m[i][3 - i - 1];
        }
        System.out.println(s);

    }
}
