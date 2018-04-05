package com.company;

public class Main {

    public static void main(String[] args) {

        int m[] = new int[5];
        boolean b = false;

        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random()*10) + 1;
        }

        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }

        for (int i = 0; i < m.length; i++) {
            b = false;
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] == m[j]) {
                    m[j] = 0;
                    b = true;
                }
            }
            if (b == true)
                m[i] = 0;
        }

        System.out.println();
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }

    }
}
