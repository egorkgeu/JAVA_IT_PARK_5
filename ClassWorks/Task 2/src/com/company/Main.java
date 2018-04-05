package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = {4,1,5,2,6};

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Укажите номер элемента массива, который хотите удалить: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;

        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < a.length/2; i++){
            int x = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = x;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }


    }
}