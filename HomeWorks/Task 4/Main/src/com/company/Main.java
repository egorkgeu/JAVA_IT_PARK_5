package com.company;

public class Main {

    public static int parse(char input[]) {
        int s = 0;
        int k = (int)Math.pow(10, input.length - 1);

        for (char c : input) {
            s = s + (c - '0') * k;
            k = k / 10;
        }
        return s;
    }

    public static void main(String[] args)  {
        char text[] = "32444643".toCharArray();
        int x = parse(text);
        System.out.println(x);
    }
}