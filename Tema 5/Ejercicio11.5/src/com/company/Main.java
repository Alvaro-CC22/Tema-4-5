package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.println("Dime un número:");
        n = sc.nextInt();

        System.out.println("Base" + "\t" +  "Cuadrado" + "\t" +  "Cubo");

        for(i = 0; i < 5; i++){
            System.out.println(n + "   \t" + (n*n) + "        \t" + (n*n*n));
            n++;
        }
    }
}
