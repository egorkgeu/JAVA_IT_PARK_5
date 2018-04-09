package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте количество строк массива: ");
        int m = scanner.nextInt();
        System.out.print("Задайте количество столбцов массива: ");
        int n = scanner.nextInt();
        int b = 1;

        int a[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                    if(i % 2 == 0){
                        a[i][j] = b;
                        b++;
                    } else{
                        a[i][n - j - 1] = b;
                        b++;
                    }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}