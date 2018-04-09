package com.company;
import java.util.Scanner;
public class Main {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Укажите размер квадратной матрицы: ");
         int k = scanner.nextInt();
         int[][] a = new int[k][k];
         for(int i = 0; i < k; i++){
             for(int j = 0; j < k; j++){
                 a[i][j]= (int)((Math.random()*10)+ 1);
             }
         }

         for(int i = 0; i < k; i++){
             for(int j = 0; j < k; j++){
                 System.out.print(a[i][j] + " ");
             }
             System.out.println();
         }
         System.out.print("Элементы побочной диагонали: ");
          int Sum = 0;
         for(int i = 0; i < k; i++){
             Sum += a[i][k-i-1];
             System.out.print(a[i][k - i - 1] + " ");
         }
         System.out.print("\n" + "Их сумма: " + Sum);
     }
}
