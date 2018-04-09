package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите колличество строк массива: ");
        int m = scanner.nextInt();
        System.out.print("Укажите количество столбцов массива: ");
        int n = scanner.nextInt();
       int a[][] = new int[m][n];
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n ; j++){
               a[i][j] = (int)((Math.random()*8 + 1));
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
        }
        System.out.print("Укажите номер строки, в которой хотите отыскать минимальный элемент массива: ");
        int i = scanner.nextInt();
        int Min = a[i][0];
        for(int j = 1; j < n; j++){
            if(a[i][j] < Min){
                a[i][j]= Min;
            }
        }
        System.out.println(Min);
    }
}
