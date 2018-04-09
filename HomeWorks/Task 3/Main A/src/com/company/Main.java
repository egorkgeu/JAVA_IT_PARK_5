package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{3,5,7,2,7,9,3,10,5,3};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        boolean b;
        for(int i = 0; i< a.length; i++){
            b = false;
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    a[j] = 0;
                    b = true;
                }
            }
            if(b == true){
                a[i] = 0;
        }
    }
        System.out.println();
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
