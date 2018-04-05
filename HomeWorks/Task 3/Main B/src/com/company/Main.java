package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = 1;

        int s[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    s[i][j] = k;
                    k++;
                }
                else {
                    s[i][n - j - 1] = k;
                    k++;
                }
            }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(s[i][j] + " ");
            System.out.println();
        }
    }
}