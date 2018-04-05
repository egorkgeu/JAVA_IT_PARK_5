package com.company;

public class Main {

    public static void main(String[] args) {

        int m[][] = new int[6][6];
        int min = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                m[i][j] = (int) (Math.random() * 10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            min = m[i][0];
            for (int j = 1; j < 6; j++) {
                if (m[i][j] < min)
                    min = m[i][j];
            }
            System.out.println(min);
        }


    }
}